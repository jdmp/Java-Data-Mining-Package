package org.jdmp.itext;

import java.awt.Component;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;

import org.ujmp.core.util.io.UJMPFileFilter;
import org.ujmp.gui.util.CanRenderGraph;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.DefaultFontMapper;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;

public abstract class ExportPDF {

	private static final Logger logger = Logger.getLogger(ExportPDF.class.getName());

	public static final File selectFile() {
		return selectFile(null);
	}

	public static final File selectFile(Component c) {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(UJMPFileFilter.PDFFilter);
		int returnVal = chooser.showOpenDialog(c);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			if (!file.getAbsolutePath().toLowerCase().endsWith(".pdf"))
				file = new File(file.getAbsolutePath() + ".pdf");
			return file;
		}
		return null;
	}

	public static final void save(File file, Component c) {
		save(file, c, c.getWidth(), c.getHeight());
	}

	public static final void save(File file, Component c, int width, int height) {
		if (file == null) {
			logger.log(Level.WARNING, "no file selected");
			return;
		}
		if (c == null) {
			logger.log(Level.WARNING, "no component provided");
			return;
		}
		try {
			Document document = new Document(new com.lowagie.text.Rectangle(width, height));
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file.getAbsolutePath()));
			document.addAuthor("JDMP");
			document.open();
			PdfContentByte cb = writer.getDirectContent();
			PdfTemplate tp = cb.createTemplate(width, height);
			Graphics2D g2 = tp.createGraphics(width, height, new DefaultFontMapper());
			if (c instanceof CanRenderGraph) {
				((CanRenderGraph) c).renderGraph(g2);
			} else {
				c.paint(g2);
			}
			g2.dispose();
			cb.addTemplate(tp, 0, 0);
			document.close();
		} catch (Exception e) {
			logger.log(Level.WARNING, "could not save PDF file", e);
		}
	}
}