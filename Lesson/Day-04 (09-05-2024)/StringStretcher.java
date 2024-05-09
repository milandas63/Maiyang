package iig.algorithm;

public class StringStretcher {
	public String stretch(String text, int length, char padWith, char whichSide) {
		String retVal = text;
		for(int i=text.length(); i<length; i++) {
			switch(whichSide) {
			case 'L':
				retVal = padWith+retVal;
				break;
			case 'C':
				if(i%2==0) {
					retVal = padWith+retVal;
				} else {
					retVal = retVal+padWith;
				}
				break;
			case 'R':
				retVal = retVal+padWith;
				break;
			}
		}
		
		return retVal;
	}

	public String padLeft(String text, int length) {
		return stretch(text, length, ' ', 'L');
	}

	public String padLeft(String text, int length, char padWith) {
		return stretch(text, length, padWith, 'L');
	}

	public String padCenter(String text, int length) {
		return stretch(text, length, ' ', 'C');
	}

	public String padCenter(String text, int length, char padWith) {
		return stretch(text, length, padWith, 'C');
	}

	public String padRight(String text, int length) {
		return stretch(text, length, ' ', 'R');
	}

	public String padRight(String text, int length, char padWith) {
		return stretch(text, length, padWith, 'R');
	}

}
