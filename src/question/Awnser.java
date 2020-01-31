package question;

public class Awnser {
	private char awnser;
	private int good_awnser ;
	private int bad_awnser ;
	private boolean result;

	public Awnser() {
	}

	public char getAwnser() {
		return awnser;
	}

	public int getGood_awnser() {
		return good_awnser;
	}

	public int getBad_awnser() {
		return bad_awnser;
	}
	
	public void esquema(char awnser,int value ) {
		if (value == 1) {
			if (awnser == 'd' || awnser == 'D') {
				this.good_awnser += 1;
				result = true;
			} else {
				this.bad_awnser += 1;
				result = false;
			}
		}
		if (value == 2) {
			if (awnser == 'a' || awnser == 'A') {
				this.good_awnser += 1;
				result = true;
			} else {
				this.bad_awnser += 1;
				result = false;
			}
		}
		if (value == 3) {
			if (awnser == 'B' || awnser == 'b') {
				this.good_awnser += 1;
				result = true;
			} else {
				this.bad_awnser += 1;
				result = false;
			}
		}
		if (value == 4) {
			if (awnser == 'c' || awnser == 'C') {
				this.good_awnser += 1;
				result = true;
			} else {
				this.bad_awnser += 1;
				result = false;
			}
		}
		if (value == 5) {
			if (awnser == 'B' || awnser == 'b') {
				this.good_awnser += 1;
				result = true;
			} else {
				this.bad_awnser += 1;
				result = false;
			}
		}
	}

	public String getResult() {
		if (result == true) {
			return "Sua resposta esta correta";
		} else {
			return "Sua resposta esta errada";
		}
	}
	
	public String showStatistc() {
		if(good_awnser == 5) {
			return "Voce foi excelente, acertou todas, parabéns";
		}
		else if (good_awnser == 4) {
			return "Voce foi muito bom, acertou quase todas";
		}
		else if(good_awnser == 3) {
			return "Voce foi bem, mas dava pra melhorar";
		}
		else if(good_awnser == 2) {
			return "mais ou menos né fera";
		}
		else if(good_awnser == 1) {
			return "só isso ?";
		}
		else {
			return "voce foi péssimo";
		}
	}
	
	public String toString() {
		return "Respostas certas: " + getGood_awnser() + "\nRespostas erradas: " + getBad_awnser();
		
	}
	
	

}
