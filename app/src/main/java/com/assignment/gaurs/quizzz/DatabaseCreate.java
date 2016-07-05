package com.assignment.gaurs.quizzz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

public class DatabaseCreate extends SQLiteOpenHelper {
        private static final String DATABASE_NAME="Quizzz.db";
        private static final String TABLE_QUEST="Quest";
        private static final String QUESTION = "Question" ;
        private static final String OPTIONA = "optiona" ;
        private static final String OPTIONB = "optionb" ;
        private static final String OPTIONC = "optionc" ;
        private static final String OPTIOND = "optiond" ;
        private static final String ANSWER = "answer" ;
        SQLiteDatabase dbase;
        public DatabaseCreate(Context context) {
            super(context, DATABASE_NAME, null, 1);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            dbase=db;
            db.execSQL("create table if not exists Quest(QID int primary key, Question varchar(500) not null, optiona varchar(50) not null, optionb varchar(50) not null, optionc varchar(50) not null, optiond varchar(50) not null, answer varchar(50) not null)");
            addQuestions();
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS Quest");
            onCreate(db);
        }
        private void addQuestions()
        {
            Question q1=new Question(1,"Which among the following brand is most influential brand in India?","Microsoft", "Google","Amazon", "Facebook", "Google");
            this.addQuestion(q1);
            Question q2=new Question(2,"Who among the following is the newly elected FIFA president?","Prince Ali of Jordan","Sheikh Salman","Gianni Infantino","Jerome Champagne","Gianni Infantino");
            this.addQuestion(q2);
            Question q3=new Question(3,"12th South Asian Games held at?","Bengaluru","Hyderabad","Guwahati and Shillong","New Delhi","Guwahati and Shillong" );
            this.addQuestion(q3);
            Question q4=new Question(4,"Who has won the FIFA world player award for 2015?","Cristiano Ronaldo","Lionel Messi","Neymar","Luis Suárez","Lionel Messi");
            this.addQuestion(q4);
            Question q5=new Question(5,"Who was the founder of the City of Agra?","Ala-ud-din Khalji","Muhammad Tughlaq","Firoz Tughlaq","Sikandar Lodi","Sikandar Lodi");
            this.addQuestion(q5);
            Question q6=new Question(6,"The members of the Rajya Sabha are elected by ________","the people","Lok Sabha","elected members of the legislative assembly","elected members of the legislative council","elected members of the legislative assembly");
            this.addQuestion(q6);
            Question q7=new Question(7,"The power to decide an election petition is vested in the________","Parliament","Supreme Court","High courts","Election Commission","High courts");
            this.addQuestion(q7);
            Question q8=new Question(8,"The present Lok Sabha is the________","13th Lok Sabha","14th Lok Sabha","15th Lok Sabha","16th Lok Sabha","16th Lok Sabha");
            this.addQuestion(q8);
            Question q9=new Question(9,"The members of Lok Sabha hold office for a term of _______", "4 years", "5 years", "6 years","3 years","5 years" );
            this.addQuestion(q9);
            Question q10=new Question(10,"The minimum age to qualify for election to the Lok Sabha is _______", "25 years","21 years","18 years","20 years", "25 years");
            this.addQuestion(q10);
            Question q11=new Question(11,"Hitler party which came into power in 1933 is known as _____", "Labour Party","Nazi Party","Ku-Klux-Klan","Democratic Party","Nazi Party");
            this.addQuestion(q11);
            Question q12=new Question(12,"First China War was fought between _______", "China and Britain", "China and France", "China and Greek", "China and Egypt", "China and Britain");
            this.addQuestion(q12);
            Question q13=new Question(13,"Gravity setting chambers are used in industries to remove", "SOx", "NOx", "suspended particulate matter","CO", "suspended particulate matter");
            this.addQuestion(q13);
            Question q14=new Question(14,"Friction can be reduced by changing from", "sliding to rolling","rolling to sliding","potential energy to kinetic energy","dynamic to static","sliding to rolling");
            this.addQuestion(q14);
            Question q15=new Question(15,"Fire temple is the place of worship of which of the following religion?", "Taoism","Judaism","Zoroastrianism","Shintoism","Zoroastrianism");
            this.addQuestion(q15);
            Question q16=new Question(16,"Film and TV institute of India is located at", "Pune (Maharashtra)","Rajkot (Gujarat)","Pimpri (Maharashtra)","Perambur (Tamilnadu)","Pune (Maharashtra)");
            this.addQuestion(q16);
            Question q17=new Question(17,"Who has been awarded Nelson Mandela Graca Innovation Award for 2016?","Tabassum Adnan","Malala","Adnan Mehboothi","Madona","Tabassum Adnan");
            this.addQuestion(q17);
            Question q18=new Question(18,"National Panchayati Raj Divas was celebrated on ________ of every year.","23 April","24 May","24 April","23 May","24 April");
            this.addQuestion(q18);
            Question q19=new Question(19,"India has to play its first Day Night test against which country in 2016?","Australia","England","New Zealand","South Africa","New Zealand");
            this.addQuestion(q19);
            Question q20=new Question(20,"Who is appointed as BCCI's CEO?","Rahul Johri","Anil Kumble","Srinivasan","Kapil Dev","Rahul Johri");
            this.addQuestion(q20);
            Question q21=new Question(21,"Shaheen - V is an exercise between which two countries?","China And Pakistan","China And India","Pakistan And America","India And Pakistan","China And Pakistan");
            this.addQuestion(q21);
            Question q22=new Question(22,"Who becomes Gujarat's first women director general of police?","Geetha Johri","Kanchan Chaudhary","Sarojini","Latika Saran","Geetha Johri");
            this.addQuestion(q22);
            Question q23=new Question(23,"What was the venue of 2016 Nuclear Security Summit?","Washington","Brussels","Mumbai","Riyadh","Washington");
            this.addQuestion(q23);
            Question q24=new Question(24,"ICC Twenty20 champions title was clinched by which country?","India","Australia","New Zealand","West Indies","West Indies");
            this.addQuestion(q24);
            Question q25=new Question(25,"India’s fastest train launched. Name it.","Fast n Tez express","Speed Express","Gati Express","Gatimaan Express","Gatimaan Express");
            this.addQuestion(q25);
            Question q26=new Question(26,"Snapdeal launches donation program. Name it.","Sunshine","DonateIt","Donatea Life","Jovline","Sunshine");
            this.addQuestion(q26);
            Question q27=new Question(27,"_______becomes largest freight loading railway zone?","South Coast Railway","East Coast Railway","North Coast Railway","West Coast Railway","East Coast Railway");
            this.addQuestion(q27);
            Question q28=new Question(28,"Which Government imposes complete ban on alcohol?","Rajasthan","Punjab","Bihar","Uttar Pradesh","Bihar");
            this.addQuestion(q28);
            Question q29=new Question(29,"Google launches Android Auto in ________.","Philippines","Vietnam","India","USA","India");
            this.addQuestion(q29);
            Question q30=new Question(30,"_______ unveils world’s thinnest laptop?","Dell","Sony","HP","Lenovo","HP");
            this.addQuestion(q30);
            Question q31=new Question(31,"Who has been appointed as head of Lamborghini India Pvt Ltd?","Indrani Menon","Paras Mehta","Naresh Krishna","Sharad Agrawal","Sharad Agrawal");
            this.addQuestion(q31);
            Question q32=new Question(32,"GOI signs up _______ to endorse Skill India.","Vishwanthan Anand","Amitabh Bachchan","Shahrukh Khan","Sachin Tendulkar","Sachin Tendulkar");
            this.addQuestion(q32);
            Question q33=new Question(33,"Which state is to pull all major public services online?","Maharashtra","Odisha","Kerala","Telangana","Maharashtra");
            this.addQuestion(q33);
            Question q34=new Question(34,"Govt approves India’s first pod taxi project in_______.","Gurgaon","Mumbai","Chennai","Delhi","Gurgaon");
            this.addQuestion(q34);
            Question q35=new Question(35,"India and _______ sign six agreements in different sectors.","Maldives","Germany","China","USA","Maldives");
            this.addQuestion(q35);
            Question q36=new Question(36,"_____ get payments bank licence from RBI.","Idea","Vodafone","Airtel","Tata Docomo","Airtel");
            this.addQuestion(q36);
            Question q37=new Question(37,"Who launches ambitious Climate Change Action Plan?","NASA","World Bank","IPCC","None of the option","World Bank");
            this.addQuestion(q37);
            Question q38=new Question(38,"______conferred Padma Awards 2016.","Narendra Modi","Pranab Mukherjee","Smiriti Irani","None of the above","Pranab Mukherjee");
            this.addQuestion(q38);
            Question q39=new Question(39,"Federal Bank launches________ for students.","C-Wallet","Campus Wallet","e-Purse","Camp Wallet","Campus Wallet");
            this.addQuestion(q39);
            Question q40=new Question(40,"India and _____agree for logistics exchange to enhance military cooperation.","USA","Mynammar","Saudi Arabia","China","USA");
            this.addQuestion(q40);

        }
        public void addQuestion(Question quest) {
            ContentValues values = new ContentValues();
            values.put(QUESTION, quest.getQUESTION());
            values.put(ANSWER, quest.getANSWER());
            values.put(OPTIONA, quest.getOPTA());
            values.put(OPTIONB, quest.getOPTB());
            values.put(OPTIONC, quest.getOPTC());
            values.put(OPTIOND, quest.getOPTD());
            dbase.insert("Quest", null, values);
        }
        public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
        do {
            Question quest = new Question();
            quest.setQUESTION(cursor.getString(1));
            quest.setOPTA(cursor.getString(2));
            quest.setOPTB(cursor.getString(3));
            quest.setOPTC(cursor.getString(4));
            quest.setOPTD(cursor.getString(5));
            quest.setANSWER(cursor.getString(6));
            quesList.add(quest);
        } while (cursor.moveToNext());
            }
        return quesList;
        }
}