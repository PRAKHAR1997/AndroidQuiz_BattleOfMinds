package com.assignment.gaurs.quizzz;

public class Question {
        private int ID;
        private String QUESTION;
        private String OPTA;
        private String OPTB;
        private String OPTC;
        private String OPTD;
        private String ANSWER;
        public Question()
        {
            ID=0;
            QUESTION="";
            OPTA="";
            OPTB="";
            OPTC="";
            OPTD="";
            ANSWER="";
        }
        public Question(int id, String qUESTION, String oPTA, String oPTB, String oPTC, String oPTD,String aNSWER) {
            ID=id;
            QUESTION = qUESTION;
            OPTD=oPTD;
            OPTA = oPTA;
            OPTB = oPTB;
            OPTC = oPTC;
            ANSWER = aNSWER;
        }
        public int getID() {
        return ID;
    }
        public String getQUESTION() {
            return QUESTION;
        }
        public String getOPTA() {
            return OPTA;
        }
        public String getOPTB() {
            return OPTB;
        }
        public String getOPTC() {
            return OPTC;
        }
        public String getOPTD() {
        return OPTD;
    }
        public String getANSWER() {
            return ANSWER;
        }

        public void setQUESTION(String qUESTION) {
            QUESTION = qUESTION;
        }
        public void setOPTA(String oPTA) {
            OPTA = oPTA;
        }
        public void setOPTB(String oPTB) {
            OPTB = oPTB;
        }
        public void setOPTC(String oPTC) {
            OPTC = oPTC;
        }
        public void setID(int ID) {
        this.ID = ID;
    }
        public void setOPTD(String oPTD) {
        OPTD = oPTD;
    }
        public void setANSWER(String aNSWER) {
            ANSWER = aNSWER;
        }
    }
