package com.thesoftwarefactory.vertx.web.bind;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;

public class MyBean {
	private boolean myPrimitiveBoolean;
	private byte myPrimitiveByte;
	private int myPrimitiveInt;
	private long myPrimitiveLong;
	private double myPrimitiveDouble;
	private float myPrimitiveFloat;
	private short myPrimitiveShort;
	private char myPrimitiveChar;

	private Boolean myBoolean;
	private Byte mByte;
	private Integer myInt;
	private Long myLong;
	private Double myDouble;
	private Float myFloat;
	private Short myShort;
	private Character myChar;

	private String myString;
	private Instant myInstant;
	private MyBean myBean;

	private boolean[] myPrimitiveBooleanArray;
	private byte[] myPrimitiveByteArray;
	private int[] myPrimitiveIntArray;
	private long[] myPrimitiveLongArray;
	private double[] myPrimitiveDoubleArray;
	private float[] myPrimitiveFloatArray;
	private short[] myPrimitiveShortArray;
	private char[] myPrimitiveCharArray;

	private String[] myStringArray;
	private Instant[] myInstantArray;
	private MyBean[] myBeanArray;

	private Collection<Boolean> myBooleans;
	private Collection<Byte> mBytes;
	private Collection<Integer> myInts;
	private Collection<Long> myLongs;
	private Collection<Double> myDoubles;
	private Collection<Float> myFloats;
	private Collection<Short> myShorts;
	private Collection<Character> myChars;

	private Collection<String> myStrings;
	private Collection<Instant> myInstants;
	private Collection<MyBean> myBeans;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyBean other = (MyBean) obj;
		if (mByte == null) {
			if (other.mByte != null)
				return false;
		} else if (!mByte.equals(other.mByte))
			return false;
		if (mBytes == null) {
			if (other.mBytes != null)
				return false;
		} else if (!mBytes.equals(other.mBytes))
			return false;
		if (myBean == null) {
			if (other.myBean != null)
				return false;
		} else if (!myBean.equals(other.myBean))
			return false;
		if (!Arrays.equals(myBeanArray, other.myBeanArray))
			return false;
		if (myBeans == null) {
			if (other.myBeans != null)
				return false;
		} else if (!myBeans.equals(other.myBeans))
			return false;
		if (myBoolean == null) {
			if (other.myBoolean != null)
				return false;
		} else if (!myBoolean.equals(other.myBoolean))
			return false;
		if (myBooleans == null) {
			if (other.myBooleans != null)
				return false;
		} else if (!myBooleans.equals(other.myBooleans))
			return false;
		if (myChar == null) {
			if (other.myChar != null)
				return false;
		} else if (!myChar.equals(other.myChar))
			return false;
		if (myChars == null) {
			if (other.myChars != null)
				return false;
		} else if (!myChars.equals(other.myChars))
			return false;
		if (myDouble == null) {
			if (other.myDouble != null)
				return false;
		} else if (!myDouble.equals(other.myDouble))
			return false;
		if (myDoubles == null) {
			if (other.myDoubles != null)
				return false;
		} else if (!myDoubles.equals(other.myDoubles))
			return false;
		if (myFloat == null) {
			if (other.myFloat != null)
				return false;
		} else if (!myFloat.equals(other.myFloat))
			return false;
		if (myFloats == null) {
			if (other.myFloats != null)
				return false;
		} else if (!myFloats.equals(other.myFloats))
			return false;
		if (myInstant == null) {
			if (other.myInstant != null)
				return false;
		} else if (!myInstant.equals(other.myInstant))
			return false;
		if (!Arrays.equals(myInstantArray, other.myInstantArray))
			return false;
		if (myInstants == null) {
			if (other.myInstants != null)
				return false;
		} else if (!myInstants.equals(other.myInstants))
			return false;
		if (myInt == null) {
			if (other.myInt != null)
				return false;
		} else if (!myInt.equals(other.myInt))
			return false;
		if (myInts == null) {
			if (other.myInts != null)
				return false;
		} else if (!myInts.equals(other.myInts))
			return false;
		if (myLong == null) {
			if (other.myLong != null)
				return false;
		} else if (!myLong.equals(other.myLong))
			return false;
		if (myLongs == null) {
			if (other.myLongs != null)
				return false;
		} else if (!myLongs.equals(other.myLongs))
			return false;
		if (myPrimitiveBoolean != other.myPrimitiveBoolean)
			return false;
		if (!Arrays.equals(myPrimitiveBooleanArray, other.myPrimitiveBooleanArray))
			return false;
		if (myPrimitiveByte != other.myPrimitiveByte)
			return false;
		if (!Arrays.equals(myPrimitiveByteArray, other.myPrimitiveByteArray))
			return false;
		if (myPrimitiveChar != other.myPrimitiveChar)
			return false;
		if (!Arrays.equals(myPrimitiveCharArray, other.myPrimitiveCharArray))
			return false;
		if (Double.doubleToLongBits(myPrimitiveDouble) != Double.doubleToLongBits(other.myPrimitiveDouble))
			return false;
		if (!Arrays.equals(myPrimitiveDoubleArray, other.myPrimitiveDoubleArray))
			return false;
		if (Float.floatToIntBits(myPrimitiveFloat) != Float.floatToIntBits(other.myPrimitiveFloat))
			return false;
		if (!Arrays.equals(myPrimitiveFloatArray, other.myPrimitiveFloatArray))
			return false;
		if (myPrimitiveInt != other.myPrimitiveInt)
			return false;
		if (!Arrays.equals(myPrimitiveIntArray, other.myPrimitiveIntArray))
			return false;
		if (myPrimitiveLong != other.myPrimitiveLong)
			return false;
		if (!Arrays.equals(myPrimitiveLongArray, other.myPrimitiveLongArray))
			return false;
		if (myPrimitiveShort != other.myPrimitiveShort)
			return false;
		if (!Arrays.equals(myPrimitiveShortArray, other.myPrimitiveShortArray))
			return false;
		if (myShort == null) {
			if (other.myShort != null)
				return false;
		} else if (!myShort.equals(other.myShort))
			return false;
		if (myShorts == null) {
			if (other.myShorts != null)
				return false;
		} else if (!myShorts.equals(other.myShorts))
			return false;
		if (myString == null) {
			if (other.myString != null)
				return false;
		} else if (!myString.equals(other.myString))
			return false;
		if (!Arrays.equals(myStringArray, other.myStringArray))
			return false;
		if (myStrings == null) {
			if (other.myStrings != null)
				return false;
		} else if (!myStrings.equals(other.myStrings))
			return false;
		return true;
	}

	public Byte getmByte() {
		return mByte;
	}

	public Collection<Byte> getmBytes() {
		return mBytes;
	}

	public MyBean getMyBean() {
		return myBean;
	}

	public MyBean[] getMyBeanArray() {
		return myBeanArray;
	}

	public Collection<MyBean> getMyBeans() {
		return myBeans;
	}

	public Boolean getMyBoolean() {
		return myBoolean;
	}

	public Collection<Boolean> getMyBooleans() {
		return myBooleans;
	}

	public Character getMyChar() {
		return myChar;
	}

	public Collection<Character> getMyChars() {
		return myChars;
	}

	public Double getMyDouble() {
		return myDouble;
	}

	public Collection<Double> getMyDoubles() {
		return myDoubles;
	}

	public Float getMyFloat() {
		return myFloat;
	}

	public Collection<Float> getMyFloats() {
		return myFloats;
	}

	public Instant getMyInstant() {
		return myInstant;
	}

	public Instant[] getMyInstantArray() {
		return myInstantArray;
	}

	public Collection<Instant> getMyInstants() {
		return myInstants;
	}

	public Integer getMyInt() {
		return myInt;
	}

	public Collection<Integer> getMyInts() {
		return myInts;
	}

	public Long getMyLong() {
		return myLong;
	}

	public Collection<Long> getMyLongs() {
		return myLongs;
	}

	public boolean[] getMyPrimitiveBooleanArray() {
		return myPrimitiveBooleanArray;
	}

	public byte getMyPrimitiveByte() {
		return myPrimitiveByte;
	}

	public byte[] getMyPrimitiveByteArray() {
		return myPrimitiveByteArray;
	}

	public char getMyPrimitiveChar() {
		return myPrimitiveChar;
	}

	public char[] getMyPrimitiveCharArray() {
		return myPrimitiveCharArray;
	}

	public double getMyPrimitiveDouble() {
		return myPrimitiveDouble;
	}

	public double[] getMyPrimitiveDoubleArray() {
		return myPrimitiveDoubleArray;
	}

	public float getMyPrimitiveFloat() {
		return myPrimitiveFloat;
	}

	public float[] getMyPrimitiveFloatArray() {
		return myPrimitiveFloatArray;
	}

	public int getMyPrimitiveInt() {
		return myPrimitiveInt;
	}

	public int[] getMyPrimitiveIntArray() {
		return myPrimitiveIntArray;
	}

	public long getMyPrimitiveLong() {
		return myPrimitiveLong;
	}

	public long[] getMyPrimitiveLongArray() {
		return myPrimitiveLongArray;
	}

	public short getMyPrimitiveShort() {
		return myPrimitiveShort;
	}

	public short[] getMyPrimitiveShortArray() {
		return myPrimitiveShortArray;
	}

	public Short getMyShort() {
		return myShort;
	}

	public Collection<Short> getMyShorts() {
		return myShorts;
	}

	public String getMyString() {
		return myString;
	}

	public String[] getMyStringArray() {
		return myStringArray;
	}

	public Collection<String> getMyStrings() {
		return myStrings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mByte == null) ? 0 : mByte.hashCode());
		result = prime * result + ((mBytes == null) ? 0 : mBytes.hashCode());
		result = prime * result + ((myBean == null) ? 0 : myBean.hashCode());
		result = prime * result + Arrays.hashCode(myBeanArray);
		result = prime * result + ((myBeans == null) ? 0 : myBeans.hashCode());
		result = prime * result + ((myBoolean == null) ? 0 : myBoolean.hashCode());
		result = prime * result + ((myBooleans == null) ? 0 : myBooleans.hashCode());
		result = prime * result + ((myChar == null) ? 0 : myChar.hashCode());
		result = prime * result + ((myChars == null) ? 0 : myChars.hashCode());
		result = prime * result + ((myDouble == null) ? 0 : myDouble.hashCode());
		result = prime * result + ((myDoubles == null) ? 0 : myDoubles.hashCode());
		result = prime * result + ((myFloat == null) ? 0 : myFloat.hashCode());
		result = prime * result + ((myFloats == null) ? 0 : myFloats.hashCode());
		result = prime * result + ((myInstant == null) ? 0 : myInstant.hashCode());
		result = prime * result + Arrays.hashCode(myInstantArray);
		result = prime * result + ((myInstants == null) ? 0 : myInstants.hashCode());
		result = prime * result + ((myInt == null) ? 0 : myInt.hashCode());
		result = prime * result + ((myInts == null) ? 0 : myInts.hashCode());
		result = prime * result + ((myLong == null) ? 0 : myLong.hashCode());
		result = prime * result + ((myLongs == null) ? 0 : myLongs.hashCode());
		result = prime * result + (myPrimitiveBoolean ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(myPrimitiveBooleanArray);
		result = prime * result + myPrimitiveByte;
		result = prime * result + Arrays.hashCode(myPrimitiveByteArray);
		result = prime * result + myPrimitiveChar;
		result = prime * result + Arrays.hashCode(myPrimitiveCharArray);
		long temp;
		temp = Double.doubleToLongBits(myPrimitiveDouble);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(myPrimitiveDoubleArray);
		result = prime * result + Float.floatToIntBits(myPrimitiveFloat);
		result = prime * result + Arrays.hashCode(myPrimitiveFloatArray);
		result = prime * result + myPrimitiveInt;
		result = prime * result + Arrays.hashCode(myPrimitiveIntArray);
		result = prime * result + (int) (myPrimitiveLong ^ (myPrimitiveLong >>> 32));
		result = prime * result + Arrays.hashCode(myPrimitiveLongArray);
		result = prime * result + myPrimitiveShort;
		result = prime * result + Arrays.hashCode(myPrimitiveShortArray);
		result = prime * result + ((myShort == null) ? 0 : myShort.hashCode());
		result = prime * result + ((myShorts == null) ? 0 : myShorts.hashCode());
		result = prime * result + ((myString == null) ? 0 : myString.hashCode());
		result = prime * result + Arrays.hashCode(myStringArray);
		result = prime * result + ((myStrings == null) ? 0 : myStrings.hashCode());
		return result;
	}

	public boolean isMyBoolean() {
		return myBoolean;
	}

	public boolean isMyPrimitiveBoolean() {
		return myPrimitiveBoolean;
	}

	public void setmByte(Byte mByte) {
		this.mByte = mByte;
	}

	public void setmBytes(Collection<Byte> mBytes) {
		this.mBytes = mBytes;
	}

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}

	public void setMyBeanArray(MyBean[] myBeanArray) {
		this.myBeanArray = myBeanArray;
	}

	public void setMyBeans(Collection<MyBean> myBeans) {
		this.myBeans = myBeans;
	}

	public void setMyBoolean(boolean myBoolean) {
		this.myBoolean = myBoolean;
	}

	public void setMyBoolean(Boolean myBoolean) {
		this.myBoolean = myBoolean;
	}

	public void setMyBooleans(Collection<Boolean> myBooleans) {
		this.myBooleans = myBooleans;
	}

	public void setMyChar(Character myChar) {
		this.myChar = myChar;
	}

	public void setMyChars(Collection<Character> myChars) {
		this.myChars = myChars;
	}

	public void setMyDouble(Double myDouble) {
		this.myDouble = myDouble;
	}

	public void setMyDoubles(Collection<Double> myDoubles) {
		this.myDoubles = myDoubles;
	}

	public void setMyFloat(Float myFloat) {
		this.myFloat = myFloat;
	}

	public void setMyFloats(Collection<Float> myFloats) {
		this.myFloats = myFloats;
	}

	public void setMyInstant(Instant myInstant) {
		this.myInstant = myInstant;
	}

	public void setMyInstantArray(Instant[] myInstantArray) {
		this.myInstantArray = myInstantArray;
	}

	public void setMyInstants(Collection<Instant> myInstants) {
		this.myInstants = myInstants;
	}

	public void setMyInt(Integer myInt) {
		this.myInt = myInt;
	}

	public void setMyInts(Collection<Integer> myInts) {
		this.myInts = myInts;
	}

	public void setMyLong(Long myLong) {
		this.myLong = myLong;
	}

	public void setMyLongs(Collection<Long> myLongs) {
		this.myLongs = myLongs;
	}

	public void setMyPrimitiveBoolean(boolean myPrimitiveBoolean) {
		this.myPrimitiveBoolean = myPrimitiveBoolean;
	}

	public void setMyPrimitiveBooleanArray(boolean[] myPrimitiveBooleanArray) {
		this.myPrimitiveBooleanArray = myPrimitiveBooleanArray;
	}

	public void setMyPrimitiveByte(byte myPrimitiveByte) {
		this.myPrimitiveByte = myPrimitiveByte;
	}

	public void setMyPrimitiveByteArray(byte[] myPrimitiveByteArray) {
		this.myPrimitiveByteArray = myPrimitiveByteArray;
	}

	public void setMyPrimitiveChar(char myPrimitiveChar) {
		this.myPrimitiveChar = myPrimitiveChar;
	}

	public void setMyPrimitiveCharArray(char[] myPrimitiveCharArray) {
		this.myPrimitiveCharArray = myPrimitiveCharArray;
	}

	public void setMyPrimitiveDouble(double myPrimitiveDouble) {
		this.myPrimitiveDouble = myPrimitiveDouble;
	}

	public void setMyPrimitiveDoubleArray(double[] myPrimitiveDoubleArray) {
		this.myPrimitiveDoubleArray = myPrimitiveDoubleArray;
	}

	public void setMyPrimitiveFloat(float myPrimitiveFloat) {
		this.myPrimitiveFloat = myPrimitiveFloat;
	}

	public void setMyPrimitiveFloatArray(float[] myPrimitiveFloatArray) {
		this.myPrimitiveFloatArray = myPrimitiveFloatArray;
	}

	public void setMyPrimitiveInt(int myPrimitiveInt) {
		this.myPrimitiveInt = myPrimitiveInt;
	}

	public void setMyPrimitiveIntArray(int[] myPrimitiveIntArray) {
		this.myPrimitiveIntArray = myPrimitiveIntArray;
	}

	public void setMyPrimitiveLong(long myPrimitiveLong) {
		this.myPrimitiveLong = myPrimitiveLong;
	}

	public void setMyPrimitiveLongArray(long[] myPrimitiveLongArray) {
		this.myPrimitiveLongArray = myPrimitiveLongArray;
	}

	public void setMyPrimitiveShort(short myPrimitiveShort) {
		this.myPrimitiveShort = myPrimitiveShort;
	}

	public void setMyPrimitiveShortArray(short[] myPrimitiveShortArray) {
		this.myPrimitiveShortArray = myPrimitiveShortArray;
	}

	public void setMyShort(Short myShort) {
		this.myShort = myShort;
	}

	public void setMyShorts(Collection<Short> myShorts) {
		this.myShorts = myShorts;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public void setMyStringArray(String[] myStringArray) {
		this.myStringArray = myStringArray;
	}

	public void setMyStrings(Collection<String> myStrings) {
		this.myStrings = myStrings;
	}

}
