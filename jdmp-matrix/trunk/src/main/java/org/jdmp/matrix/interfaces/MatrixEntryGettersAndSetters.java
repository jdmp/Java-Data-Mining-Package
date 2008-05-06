package org.jdmp.matrix.interfaces;

import java.util.Date;

import org.jdmp.matrix.MatrixException;

/**
 * This interface declares the getters and setters for the entries in the Matrix
 * for the most important Java types: boolean, int, char, float, double, long,
 * Date, Object and String.
 * <p>
 * The matrix will try to convert its content to the desired format as good as
 * possible. For example, a Matrix with String entries will try to parse each
 * String to a Double when you invoke getDoubleValue(). Note, that there will be
 * no exception if the entry cannot be converted. Instead, the result will be
 * either null, 0, false or Double.NaN depending on the method.
 */
public interface MatrixEntryGettersAndSetters {

	/**
	 * Returns a boolean representation of an entry in the matrix. The stored
	 * value will be converted to a boolean as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a boolean representation of the entry
	 * @throws MatrixException
	 */
	public boolean getBoolean(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a boolean value. If the matrix cannot
	 * store boolean values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            boolean value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setBoolean(boolean value, long... coordinates) throws MatrixException;

	/**
	 * Returns a byte representation of an entry in the matrix. The stored value
	 * will be converted to a byte as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a byte representation of the entry
	 * @throws MatrixException
	 */
	public byte getByte(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a byte value. If the matrix cannot store
	 * byte values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            byte value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setByte(byte value, long... coordinates) throws MatrixException;

	/**
	 * Returns a char representation of an entry in the matrix. The stored value
	 * will be converted to a char as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a char representation of the entry
	 * @throws MatrixException
	 */
	public char getChar(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a char value. If the matrix cannot store
	 * char values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            char value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setChar(char value, long... coordinates) throws MatrixException;

	/**
	 * Returns a short representation of an entry in the matrix. The stored
	 * value will be converted to a short as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a short representation of the entry
	 * @throws MatrixException
	 */
	public short getShort(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a short value. If the matrix cannot store
	 * short values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            short value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setShort(short value, long... coordinates) throws MatrixException;

	/**
	 * Returns an int representation of an entry in the matrix. The stored value
	 * will be converted to an int as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return an int representation of the entry
	 * @throws MatrixException
	 */
	public int getInt(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to an int value. If the matrix cannot store
	 * int values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            int value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setInt(int value, long... coordinates) throws MatrixException;

	/**
	 * Returns a long representation of an entry in the matrix. The stored value
	 * will be converted to a long as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a long representation of the entry
	 * @throws MatrixException
	 */
	public long getLong(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a long value. If the matrix cannot store
	 * long values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            long value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setLong(long value, long... coordinates) throws MatrixException;

	/**
	 * Returns a double representation of an entry in the matrix. The stored
	 * value will be converted to a double as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a double representation of the entry
	 * @throws MatrixException
	 */
	public double getDouble(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a double value. If the matrix cannot store
	 * double values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            double value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setDouble(double value, long... coordinates) throws MatrixException;

	/**
	 * Returns a float representation of an entry in the matrix. The stored
	 * value will be converted to a float as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a float representation of the entry
	 * @throws MatrixException
	 */
	public float getFloat(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a float value. If the matrix cannot store
	 * float values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            float value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setFloat(float value, long... coordinates) throws MatrixException;

	/**
	 * Returns a raw entry in the matrix as it is stored. If the matrix supports
	 * Generics, the return type will match the type that is stored.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return entry object
	 * @throws MatrixException
	 */
	public Object getObject(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to an object. If the matrix cannot store this
	 * object type, the value will be represented as good as possible.
	 * 
	 * @param o
	 *            the object to store
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setObject(Object o, long... coordinates) throws MatrixException;

	/**
	 * Returns a String representation of an entry in the matrix. The stored
	 * value will be converted to a String as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a String representation of the entry
	 * @throws MatrixException
	 */
	public String getString(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a String value. If the matrix cannot store
	 * Strings, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            String value
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setString(String string, long... coordinates) throws MatrixException;

	/**
	 * Returns a Date representation of an entry in the matrix. The stored value
	 * will be converted to a Date object as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a String representation of the entry
	 * @throws MatrixException
	 */
	public Date getDate(long... coordinates) throws MatrixException;

	/**
	 * Sets an entry in the matrix to a Date value. If the matrix cannot store
	 * Date objects, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            Date object to store
	 * @param coordinates
	 *            location of the entry
	 * @throws MatrixException
	 */
	public void setDate(Date date, long... coordinates) throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of double
	 * values.
	 * 
	 * @return double array with matrix entries
	 * @throws MatrixException
	 */
	public double[][] toDoubleArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of float
	 * values.
	 * 
	 * @return float array with matrix entries
	 * @throws MatrixException
	 */
	public float[][] toFloatArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of boolean
	 * values.
	 * 
	 * @return boolean array with matrix entries
	 * @throws MatrixException
	 */
	public boolean[][] toBooleanArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of byte
	 * values.
	 * 
	 * @return byte array with matrix entries
	 * @throws MatrixException
	 */
	public byte[][] toByteArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of char
	 * values.
	 * 
	 * @return char array with matrix entries
	 * @throws MatrixException
	 */
	public char[][] toCharArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of int
	 * values.
	 * 
	 * @return int array with matrix entries
	 * @throws MatrixException
	 */
	public int[][] toIntArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of long
	 * values.
	 * 
	 * @return long array with matrix entries
	 * @throws MatrixException
	 */
	public long[][] toLongArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of short
	 * values.
	 * 
	 * @return short array with matrix entries
	 * @throws MatrixException
	 */
	public short[][] toShortArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of Strings.
	 * 
	 * @return String array with matrix entries
	 * @throws MatrixException
	 */
	public String[][] toStringArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of Date
	 * values.
	 * 
	 * @return Date array with matrix entries
	 * @throws MatrixException
	 */
	public Date[][] toDateArray() throws MatrixException;

	/**
	 * Converts the content of a matrix into a 2-dimensional array of Objects.
	 * 
	 * @return Object array with matrix entries
	 * @throws MatrixException
	 */
	public Object[][] toObjectArray() throws MatrixException;

}