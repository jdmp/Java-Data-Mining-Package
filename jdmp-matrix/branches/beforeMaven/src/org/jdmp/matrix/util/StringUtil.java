package org.jdmp.matrix.util;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class StringUtil {

	private static final NumberFormat DefaultNF = NumberFormat.getNumberInstance(Locale.US);

	public static final String BRACKETS = "[\\[\\]\\(\\)\\{\\}]";

	public static final String SEMICOLONORNEWLINE = "\\s*[;\\n]\\s*";

	public static final String COLONORSPACES = "[,\\s*]";

	static {
		DefaultNF.setMinimumFractionDigits(4);
		DefaultNF.setMaximumFractionDigits(4);
	}
	
	public static final String format(Object o) {
		if (o == null) {
			return "";
		}
		if (o instanceof String) {
			return (String) o;
		}
		if (o instanceof Number) {
			return format(((Number) o).doubleValue());
		}
		return o.toString();
	}

	public static final String format(Double value) {
		if (value == null)
			return "";
		if (Double.isNaN(value))
			return "NaN";
		if (Double.POSITIVE_INFINITY == value)
			return "Inf";
		if (Double.NEGATIVE_INFINITY == value)
			return "-Inf";
		return DefaultNF.format(value);
	}

	public void setDefaultMaximumFractionDigits(int n) {
		DefaultNF.setMaximumFractionDigits(n);
	}

	public void setDefaultMinimumFractionDigits(int n) {
		DefaultNF.setMinimumFractionDigits(n);
	}

	public static final String deleteChar(String s, char ch, int startIndex) {
		int i = s.indexOf(ch, startIndex);
		if (i == -1) {
			return s;
		} else if (i == 0) {
			s = s.substring(1);
			return deleteChar(s, ch, 0);
		} else if (i == s.length() - 1) {
			s = s.substring(0, s.length() - 1);
			return s;
		} else {
			new String();
			s = s.substring(0, i) + s.substring(i + 1);
			return deleteChar(s, ch, i);
		}
	}

	public static long[][] parseSelection(String selectionString, long[] size) {

		// TODO: check that no selection is bigger than size

		String[] fields = selectionString.replaceAll(BRACKETS, "").split(";");
		long[][] selection = new long[fields.length][];

		for (int i = 0; i < fields.length; i++) {

			String dimension = fields[i].trim();

			if (dimension.contains("*")) {
				selection[i] = MathUtil.sequenceLong(0, size[i] - 1);
			} else {
				List<Long> list = new ArrayList<Long>();
				String[] dimselections = dimension.split("\\D*[ \\s,]\\D*");
				for (int j = 0; j < dimselections.length; j++) {
					String dimsel = dimselections[j];
					if (dimsel.contains(":") || dimsel.contains("-")) {
						String[] range = dimsel.split("[:-]");
						String startS = range[0];
						String endS = range[1];
						long start = Long.parseLong(startS.replaceAll("\\D", ""));
						long end = Long.parseLong(endS.replaceAll("\\D", ""));
						list.addAll(MathUtil.sequenceListLong(start, end));
					} else {
						list.add(Long.parseLong(dimsel.replaceAll("\\D", "")));
					}
				}
				selection[i] = MathUtil.listToLong(list);
			}

		}

		return selection;
	}

	public static String duration(long time) {
		StringBuffer s = new StringBuffer();

		int days = (int) (time / (24 * 60 * 60 * 1000));
		time = time % (24 * 60 * 60 * 1000);
		int hours = (int) (time / (60 * 60 * 1000));
		time = time % (60 * 60 * 1000);
		int minutes = (int) (time / (60 * 1000));
		time = time % (60 * 1000);
		int seconds = (int) (time / (1000));

		if (days > 0) {
			s.append(days + "d");
		}
		if (hours > 0) {
			s.append(hours + "h");
		}
		if (minutes > 0) {
			s.append(minutes + "m");
		}
		s.append(seconds + "s");
		return s.toString();
	}
}