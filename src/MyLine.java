public class MyLine {
    private String myLine;
    private String num = "";

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public String getMyLine() {
        return myLine;
    }

    public void setMyLine(String myLine) throws AnyException {
        Check01(myLine);
        if (num != "") {
            throw new AnyException("Значение содержит цифры или три одинаковые буквы подряд", num);
        }
        Check02(myLine);
        if (num != "") {
            throw new AnyException("Значение содержит цифры или три одинаковые буквы подряд", num);
        }
        this.myLine=myLine;
    }
    public void Check01(String myLine) {
        char[] m2 = myLine.toCharArray();
        for (int i = 0; i < myLine.length(); i++) {
            char chrs = myLine.charAt(i);
            if (Character.isDigit(chrs))
                num += chrs;
            setNum(num);
        }
    }

    public void Check02(String myLine) {
        char[] m2 = myLine.toCharArray();
        for (int i = 0; i < m2.length; i++) {
            for (int j = i + 1; j < m2.length; j++) {
                for (int y = j + 1; y < m2.length; y++) {
                    if (m2[i] == m2[j] && m2[j] == m2[y]) {
                        num += m2[i] + "" + m2[j] + "" + m2[y];
                        setNum(num);
                        break;
                    }
                }
            }
        }
    }
}

