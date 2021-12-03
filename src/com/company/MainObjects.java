package com.company;

public class MainObjects {
	void createObjects() {
		ListOfCategories qHolder = new ListOfCategories();
		ListOfStudentAttempts sHolder = new ListOfStudentAttempts();
		Category Sports = new Category("Sports");
		StudentAttempts SportsS = new StudentAttempts("Sports");
		Question sportsQuestion = new Question("Which player has won 11 titles at one particular Grand Slam event?");

		sportsQuestion.addChoice("Rafael Nadal", 0);
		sportsQuestion.addChoice("Pete Sampras", 1);
		sportsQuestion.addChoice("Roger Federer", 2);
		sportsQuestion.addChoice("Noval Djokovic");
		int I = 0;
		Sports.enqueue(sportsQuestion);

		Question sportsQuestion2 = new Question(
				"Which nation had made its debut appearance in the World Cup Hockey 2018?");
		sportsQuestion2.addChoice("China", 0);
		sportsQuestion2.addChoice("Ireland", 1);
		sportsQuestion2.addChoice("Poland", 2);
		sportsQuestion2.addChoice("Canada");
		I = 0;
		Sports.enqueue(sportsQuestion2);

		Question sportsQuestion3 = new Question(
				"The \"Allan Border Medal\" is given for the excellence in which sport's field?");
		sportsQuestion3.addChoice("Football", 2);
		sportsQuestion3.addChoice("Hockey", 1);
		sportsQuestion3.addChoice("Cricket", 0);
		sportsQuestion3.addChoice("Polo");

		I = 0;
		Sports.enqueue(sportsQuestion3);

		Question sportQuestion4 = new Question("How many team members are present in each team of a Rugby Union game?");
		sportQuestion4.addChoice("15", 0);
		sportQuestion4.addChoice("13", 1);
		sportQuestion4.addChoice("11", 2);
		sportQuestion4.addChoice("17");
		I = 0;
		Sports.enqueue(sportQuestion4);

		Question sportQuestion5 = new Question("The first official handball match was played in which country?");
		sportQuestion5.addChoice("Germany", 0);
		sportQuestion5.addChoice("Switzerland", 1);
		sportQuestion5.addChoice("Canada", 2);
		sportQuestion5.addChoice("England");
		I = 0;
		Sports.enqueue(sportQuestion5);

		Question sportQuestion6 = new Question("Who won the 2006 World Cup?");
		sportQuestion6.addChoice("Italy", 0);
		sportQuestion6.addChoice("Germany", 1);
		sportQuestion6.addChoice("France", 2);
		sportQuestion6.addChoice("Brazil");
		I = 0;
		Sports.enqueue(sportQuestion6);

		Question sportQuestion7 = new Question("In Football,how many players is each team made of?");
		sportQuestion7.addChoice("11", 0);
		sportQuestion7.addChoice("12", 1);
		sportQuestion7.addChoice("9", 2);
		sportQuestion7.addChoice("5");
		I = 0;
		Sports.enqueue(sportQuestion7);

		Question sportQuestion8 = new Question("How long are olympic swimming pools");
		sportQuestion8.addChoice("50m", 0);
		sportQuestion8.addChoice("25m", 1);
		sportQuestion8.addChoice("30m", 2);
		sportQuestion8.addChoice("40m");
		I = 0;
		Sports.enqueue(sportQuestion8);
		Question sportQuestion9 = new Question("Who is the fastest man alive?");
		sportQuestion9.addChoice("Usain bolt", 0);
		sportQuestion9.addChoice("Yohan Blake", 1);
		sportQuestion9.addChoice("Justin Galtin", 2);
		sportQuestion9.addChoice("Christian Coleman");
		I = 0;
		Sports.enqueue(sportQuestion9);

		Question sportQuestion10 = new Question("Who won the most NBA trophies?");
		sportQuestion10.addChoice("Usain bolt", 0);
		sportQuestion10.addChoice("Magic Johnson", 1);
		sportQuestion10.addChoice("Kobe Bryant", 2);
		sportQuestion10.addChoice("Chris Bosh");
		I = 0;
		Sports.enqueue(sportQuestion10);

		qHolder.insertAtBack(Sports);
		sHolder.insertStackAtBack(SportsS);

		Category History = new Category("History");
		StudentAttempts HistoryS = new StudentAttempts("History");

		Question historyQuestion = new Question("What year did WW2 start?");
		historyQuestion.addChoice("1939", 0);
		historyQuestion.addChoice("1937", 1);
		historyQuestion.addChoice("1941", 2);
		historyQuestion.addChoice("1936");
		I = 0;
		History.enqueue(historyQuestion);

		Question historyQuestion2 = new Question("When did the golden age of Islam start?");
		historyQuestion2.addChoice("8th century", 0);
		historyQuestion2.addChoice("7th century", 1);
		historyQuestion2.addChoice("10th century", 2);
		historyQuestion2.addChoice("11th century");
		I = 0;
		History.enqueue(historyQuestion2);

		Question historyQuestion3 = new Question("What country does not have an independence day?");
		historyQuestion3.addChoice("England", 0);
		historyQuestion3.addChoice("France", 1);
		historyQuestion3.addChoice("USA", 2);
		historyQuestion3.addChoice("India");
		I = 0;
		History.enqueue(historyQuestion3);

		Question historyQuestion4 = new Question("How many European crusades were there to claim the holy land?");
		historyQuestion4.addChoice("8", 0);
		historyQuestion4.addChoice("11", 1);
		historyQuestion4.addChoice("6", 2);
		historyQuestion4.addChoice("9");
		I = 0;
		History.enqueue(historyQuestion4);

		Question historyQuestion5 = new Question("Who is the last Roman Emperor?");
		historyQuestion5.addChoice("Romulus", 0);
		historyQuestion5.addChoice("Augustun", 1);
		historyQuestion5.addChoice("Trajan", 2);
		historyQuestion5.addChoice("Aurelius");
		I = 0;
		History.enqueue(historyQuestion5);

		Question historyQuestion6 = new Question("How long did the Ottoman Empire rule?");
		historyQuestion6.addChoice("600 years", 0);
		historyQuestion6.addChoice("400 years", 1);
		historyQuestion6.addChoice("500 years", 2);
		historyQuestion6.addChoice("1000 years");
		I = 0;
		History.enqueue(historyQuestion6);

		Question historyQuestion7 = new Question("What year was the Kingdom of Saudi Arabia fouded?");
		historyQuestion7.addChoice("1932", 0);
		historyQuestion7.addChoice("1933", 1);
		historyQuestion7.addChoice("1943", 2);
		historyQuestion7.addChoice("1900");
		I = 0;
		History.enqueue(historyQuestion7);

		Question historyQuestion8 = new Question("When did the Soviet Union collapse");
		historyQuestion8.addChoice("1990", 0);
		historyQuestion8.addChoice("1890", 1);
		historyQuestion8.addChoice("2000", 2);
		historyQuestion8.addChoice("1950");
		I = 0;
		History.enqueue(historyQuestion8);

		Question historyQuestion9 = new Question("Who is the first president of Lebanon after independence?");
		historyQuestion9.addChoice("Bechara Al-Khoury", 0);
		historyQuestion9.addChoice("Fouad Chehab", 1);
		historyQuestion9.addChoice("Camille Chamoun", 2);
		historyQuestion9.addChoice("Elias Sarkis");
		I = 0;
		History.enqueue(historyQuestion9);

		Question historyQuestion10 = new Question("When did the six-day war start?");
		historyQuestion10.addChoice("1967", 0);
		historyQuestion10.addChoice("1975", 1);
		historyQuestion10.addChoice("1969", 2);
		historyQuestion10.addChoice("1948");
		I = 0;
		History.enqueue(historyQuestion10);
		qHolder.insertAtBack(History);
		sHolder.insertStackAtBack(HistoryS);

		Category Tech = new Category("Tech");
		StudentAttempts TechS = new StudentAttempts("Tech");
		Question techQuestion = new Question("Who introduced the original iPhone in 2007?");
		techQuestion.addChoice("Steve Jobs", 0);
		techQuestion.addChoice("Tim Cook", 1);
		techQuestion.addChoice("Eddy Cue", 2);
		techQuestion.addChoice("Phil Schiller");
		I = 0;
		Tech.enqueue(techQuestion);

		Question techQuestion2 = new Question("What is the best-selling video game console of all time?");
		techQuestion2.addChoice("PS2", 0);
		techQuestion2.addChoice("Nintendo DS", 1);
		techQuestion2.addChoice("Xbox 360", 2);
		techQuestion2.addChoice("Wii");
		I = 0;
		Tech.enqueue(techQuestion2);

		Question techQuestion3 = new Question("What resolution is considred 4K?");
		techQuestion3.addChoice("2160x3840", 0);
		techQuestion3.addChoice("1440x2560", 1);
		techQuestion3.addChoice("1080x1920", 2);
		techQuestion3.addChoice("720x1280");
		I = 0;
		Tech.enqueue(techQuestion3);

		Question techQuestion4 = new Question("What is the data transfer speed of USB 2.0?");
		techQuestion4.addChoice("60 mb", 0);
		techQuestion4.addChoice("40 mb", 1);
		techQuestion4.addChoice("20 mb", 2);
		techQuestion4.addChoice("50 mb");
		I = 0;
		Tech.enqueue(techQuestion4);

		Question techQuestion5 = new Question("What is the newest Nvidia graphics card series?");
		techQuestion5.addChoice("3000 series", 0);
		techQuestion5.addChoice("1000 series", 1);
		techQuestion5.addChoice("900 series", 2);
		techQuestion5.addChoice("2000 series");
		I = 0;
		Tech.enqueue(techQuestion5);

		Question techQuestion6 = new Question("Who is the owner of Whatsapp?");
		techQuestion6.addChoice("Mark Zuckerburg", 0);
		techQuestion6.addChoice("Jeff Bezoz", 1);
		techQuestion6.addChoice("Bill gates", 2);
		techQuestion6.addChoice("Elon Musk");
		I = 0;

		Tech.enqueue(techQuestion6);

		Question techQuestion7 = new Question("What is the latest Windows OS?");
		techQuestion7.addChoice("Windows 11", 0);
		techQuestion7.addChoice("Windows XP", 1);
		techQuestion7.addChoice("Windows Vista", 2);
		techQuestion7.addChoice("Windows 10");
		I = 0;
		Tech.enqueue(techQuestion7);

		Question techQuestion8 = new Question("What company owns Google");
		techQuestion8.addChoice("Alphabet", 0);
		techQuestion8.addChoice("Apple", 1);
		techQuestion8.addChoice("Amazon", 2);
		techQuestion8.addChoice("Meta");
		I = 0;
		Tech.enqueue(techQuestion8);

		Question techQuestion9 = new Question("When was Facebook founded?");
		techQuestion9.addChoice("2004", 0);
		techQuestion9.addChoice("2005", 1);
		techQuestion9.addChoice("2006", 2);
		techQuestion9.addChoice("1996");
		I = 0;
		Tech.enqueue(techQuestion9);

		Question techQuestion10 = new Question("Bill Gates is the founder of?");
		techQuestion10.addChoice("Microsoft", 0);
		techQuestion10.addChoice("Youtube", 1);
		techQuestion10.addChoice("Yahoo", 2);
		techQuestion10.addChoice("Samsung");
		I = 0;
		Tech.enqueue(techQuestion10);
		qHolder.insertAtBack(Tech);
		sHolder.insertStackAtBack(TechS);

		Category Health = new Category("Health");
		StudentAttempts HealthS = new StudentAttempts("Health");
		Question healthQuestion = new Question("How do we maintain brain health?");
		healthQuestion.addChoice("Menatal Exercise", 0);
		healthQuestion.addChoice("Physical Activity", 1);
		healthQuestion.addChoice("Nutricious Food", 2);
		healthQuestion.addChoice("Fresh Air");
		I = 0;
		Health.enqueue(healthQuestion);

		Question healthQuestion2 = new Question("What is the leading cause of death?");
		healthQuestion2.addChoice("Heart Disease", 0);
		healthQuestion2.addChoice("Cancer", 1);
		healthQuestion2.addChoice("Suicide", 2);
		healthQuestion2.addChoice("Chronic Back Pain");
		I = 0;
		Health.enqueue(healthQuestion2);

		Question healthQuestion3 = new Question("What is a healthy BMI?");
		healthQuestion3.addChoice("21", 0);
		healthQuestion3.addChoice("35", 1);
		healthQuestion3.addChoice("16", 2);
		healthQuestion3.addChoice("27");
		I = 0;
		Health.enqueue(healthQuestion3);

		Question healthQuestion4 = new Question("What is the smallest bone in the human body?");
		healthQuestion4.addChoice("Ear", 0);
		healthQuestion4.addChoice("Toes", 1);
		healthQuestion4.addChoice("Chin", 2);
		healthQuestion4.addChoice("Hand");
		I = 0;
		Health.enqueue(healthQuestion4);

		Question healthQuestion5 = new Question("An  ____ a day,keeps the Doctor away?");
		healthQuestion5.addChoice("Apple", 0);
		healthQuestion5.addChoice("Apricot", 1);
		healthQuestion5.addChoice("Avocado", 2);
		healthQuestion5.addChoice("Eggplant");
		I = 0;
		Health.enqueue(healthQuestion5);

		Question healthQuestion6 = new Question("Number of bones in the human body?");
		healthQuestion6.addChoice("206", 0);
		healthQuestion6.addChoice("208", 1);
		healthQuestion6.addChoice("306", 2);
		healthQuestion6.addChoice("128");
		I = 0;
		Health.enqueue(healthQuestion6);

		Question healthQuestion7 = new Question("What is the strongest muscle in the body?");
		healthQuestion7.addChoice("Tongue", 0);
		healthQuestion7.addChoice("Neck", 1);
		healthQuestion7.addChoice("Heart", 2);
		healthQuestion7.addChoice("Arm");
		I = 0;
		Health.enqueue(healthQuestion7);

		Question healthQuestion8 = new Question("The body contains almost _____");
		healthQuestion8.addChoice("100 trillion cells", 0);
		healthQuestion8.addChoice("200 trillion cells", 1);
		healthQuestion8.addChoice("100 billion cells", 2);
		healthQuestion8.addChoice("500 billion cells");
		I = 0;
		Health.enqueue(healthQuestion8);

		Question healthQuestion9 = new Question("The left lung is divided to _____ ?");
		healthQuestion9.addChoice("2 lobes", 0);
		healthQuestion9.addChoice("3 lobes", 1);
		healthQuestion9.addChoice("1 lobes", 2);
		healthQuestion9.addChoice("4 lobes");
		I = 0;
		Health.enqueue(healthQuestion9);

		Question healthQuestion10 = new Question("How many senses does the human body have?");
		healthQuestion10.addChoice("5", 0);
		healthQuestion10.addChoice("6", 1);
		healthQuestion10.addChoice("4", 2);
		healthQuestion10.addChoice("7");
		I = 0;
		Health.enqueue(healthQuestion10);
		qHolder.insertAtBack(Health);
		sHolder.insertStackAtBack(HealthS);

		Category Social = new Category("Social");
		StudentAttempts SocialS = new StudentAttempts("Social");
		Question socialQuestion = new Question("The famous show \"Squid Game\" is set in which country ?");
		socialQuestion.addChoice("South Korea", 0);
		socialQuestion.addChoice("Japan", 1);
		socialQuestion.addChoice("China", 2);
		socialQuestion.addChoice("Pakistan");
		I = 0;
		Social.enqueue(socialQuestion);

		Question socialQuestion2 = new Question("What year was the ice bucket challenge?");
		socialQuestion2.addChoice("2014", 0);
		socialQuestion2.addChoice("2017", 1);
		socialQuestion2.addChoice("2016", 2);
		socialQuestion2.addChoice("2012");
		I = 0;
		Social.enqueue(socialQuestion2);

		Question socialQuestion3 = new Question("The highest grossing film of all time is: ?");
		socialQuestion3.addChoice("Avengers Endgame", 0);
		socialQuestion3.addChoice("Fast and Furious", 1);
		socialQuestion3.addChoice("Avatar", 2);
		socialQuestion3.addChoice("Joker");
		I = 0;
		Social.enqueue(socialQuestion3);

		Question socialQuestion4 = new Question("Who has the most instagram followers ever?");
		socialQuestion4.addChoice("Cristiano Ronaldo", 0);
		socialQuestion4.addChoice("The Rock", 1);
		socialQuestion4.addChoice("Selena Gomez", 2);
		socialQuestion4.addChoice("Lionel Messi");
		I = 0;
		Social.enqueue(socialQuestion4);

		Question socialQuestion5 = new Question("The most popular social media platform is: ?");
		socialQuestion5.addChoice("Facebook", 0);
		socialQuestion5.addChoice("Instagram", 1);
		socialQuestion5.addChoice("Tiktok", 2);
		socialQuestion5.addChoice("Twitter");
		I = 0;
		Social.enqueue(socialQuestion5);

		Question socialQuestion6 = new Question("What's the most popular show on Netflix of all time?");
		socialQuestion6.addChoice("Squid Game", 0);
		socialQuestion6.addChoice("Money Heist", 1);
		socialQuestion6.addChoice("Peaky Blinders", 2);
		socialQuestion6.addChoice("Stranger Things");
		I = 0;
		Social.enqueue(socialQuestion6);

		Question socialQuestion7 = new Question("What is the most popular streaming service?");
		socialQuestion7.addChoice("Netlix", 0);
		socialQuestion7.addChoice("Netlix", 0);
		socialQuestion7.addChoice("Disney+", 0);
		socialQuestion7.addChoice("Hulu");
		I = 0;
		Social.enqueue(socialQuestion7);

		Question socialQuestion8 = new Question("What social media platform uses only audio?");
		socialQuestion8.addChoice("Clubhouse", 0);
		socialQuestion8.addChoice("Whatsapp", 1);
		socialQuestion8.addChoice("iMessage", 2);
		socialQuestion8.addChoice("Telegram");
		I = 0;
		Social.enqueue(socialQuestion8);

		Question socialQuestion9 = new Question("What social media platform did Elon Musk promote?");
		socialQuestion9.addChoice("Signal", 0);
		socialQuestion9.addChoice("Whatsapp", 1);
		socialQuestion9.addChoice("Twitter", 2);
		socialQuestion9.addChoice("Youtube");
		I = 0;
		Social.enqueue(socialQuestion9);

		Question socialQuestion10 = new Question("What song has the most views on Youtube?");
		socialQuestion10.addChoice("Baby Shark", 0);
		socialQuestion10.addChoice("Despacito", 1);
		socialQuestion10.addChoice("See You Again", 2);
		socialQuestion10.addChoice("Shape Of You");
		I = 0;
		Social.enqueue(socialQuestion10);

		qHolder.insertAtBack(Social);
		sHolder.insertStackAtBack(SocialS);

		MainMenu M = new MainMenu();
		M.display(qHolder, sHolder);

	}
}
