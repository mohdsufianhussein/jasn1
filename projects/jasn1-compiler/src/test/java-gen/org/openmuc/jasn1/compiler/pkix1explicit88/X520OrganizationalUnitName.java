/**
 * This class file was automatically generated by jASN1 v1.8.2 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.pkix1explicit88;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;


public class X520OrganizationalUnitName implements Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public BerTeletexString teletexString = null;
	public BerPrintableString printableString = null;
	public BerUniversalString universalString = null;
	public BerUTF8String utf8String = null;
	public BerBMPString bmpString = null;
	
	public X520OrganizationalUnitName() {
	}

	public X520OrganizationalUnitName(byte[] code) {
		this.code = code;
	}

	public X520OrganizationalUnitName(BerTeletexString teletexString, BerPrintableString printableString, BerUniversalString universalString, BerUTF8String utf8String, BerBMPString bmpString) {
		this.teletexString = teletexString;
		this.printableString = printableString;
		this.universalString = universalString;
		this.utf8String = utf8String;
		this.bmpString = bmpString;
	}

	public int encode(BerByteArrayOutputStream os) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (bmpString != null) {
			codeLength += bmpString.encode(os, true);
			return codeLength;
		}
		
		if (utf8String != null) {
			codeLength += utf8String.encode(os, true);
			return codeLength;
		}
		
		if (universalString != null) {
			codeLength += universalString.encode(os, true);
			return codeLength;
		}
		
		if (printableString != null) {
			codeLength += printableString.encode(os, true);
			return codeLength;
		}
		
		if (teletexString != null) {
			codeLength += teletexString.encode(os, true);
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(BerTeletexString.tag)) {
			teletexString = new BerTeletexString();
			codeLength += teletexString.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerPrintableString.tag)) {
			printableString = new BerPrintableString();
			codeLength += printableString.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerUniversalString.tag)) {
			universalString = new BerUniversalString();
			codeLength += universalString.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerUTF8String.tag)) {
			utf8String = new BerUTF8String();
			codeLength += utf8String.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerBMPString.tag)) {
			bmpString = new BerBMPString();
			codeLength += bmpString.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		BerByteArrayOutputStream os = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(os);
		code = os.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (teletexString != null) {
			sb.append("teletexString: ").append(teletexString);
			return;
		}

		if (printableString != null) {
			sb.append("printableString: ").append(printableString);
			return;
		}

		if (universalString != null) {
			sb.append("universalString: ").append(universalString);
			return;
		}

		if (utf8String != null) {
			sb.append("utf8String: ").append(utf8String);
			return;
		}

		if (bmpString != null) {
			sb.append("bmpString: ").append(bmpString);
			return;
		}

		sb.append("<none>");
	}

}

