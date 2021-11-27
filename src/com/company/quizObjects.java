package com.company;

import java.util.Scanner;

public class quizObjects {
    QueueLinkedList qHolder = new QueueLinkedList();


    public char createObjects(QueueLinkedList qHolder){
        Scanner Input = new Scanner(System.in);
        Queue Sports = new Queue("Sports");
        Quiz sportsQuestion = new Quiz("Which player has won 11 titles at one particular Grand Slam event?");

        sportsQuestion.addChoice("Rafael Nadal",0);
        sportsQuestion.addChoice("Pete Sampras",1);
        sportsQuestion.addChoice("Roger Federer",2);
        sportsQuestion.addChoice("Noval Djokovic");
        int I = 0;
        Sports.enqueue(sportsQuestion.Question, sportsQuestion.choices, I);

        Quiz sportsQuestion2 = new Quiz("Which player has won 11 titles at one particular Grand Slam event?");
        sportsQuestion2.addChoice("Canada",0);
        sportsQuestion2.addChoice("Ireland",1);
        sportsQuestion2.addChoice("Poland",2);
        sportsQuestion2.addChoice("China");
        I = 3;
        Sports.enqueue(sportsQuestion2.Question, sportsQuestion2.choices, I);

        Quiz sportsQuestion3 = new Quiz("The �Allan Border Medal� is given for the excellence in which sport�s field?");
        sportsQuestion3.addChoice("Football",0);
        sportsQuestion3.addChoice("Hockey",1);
        sportsQuestion3.addChoice("Cricket",2);
        sportsQuestion3.addChoice("Polo");

        I = 2;
        Sports.enqueue(sportsQuestion3.Question, sportsQuestion3.choices, I);

        Quiz sportQuestion4 = new Quiz("How many team members are present in each team of a Rugby Union game?");
        sportQuestion4.addChoice("11",0);
        sportQuestion4.addChoice("13",1);
        sportQuestion4.addChoice("15",2);
        sportQuestion4.addChoice("17");
        I = 2;
        Sports.enqueue(sportQuestion4.Question, sportQuestion4.choices, I);

        Quiz sportQuestion5= new Quiz("The first official handball match was played in which country?");
        sportQuestion5.addChoice("Switzerland",0);
        sportQuestion5.addChoice("Germany",1);
        sportQuestion5.addChoice("Canada",2);
        sportQuestion5.addChoice("England");
        I = 1;
        Sports.enqueue(sportQuestion5.Question, sportQuestion5.choices, I);

        Quiz sportQuestion6 = new Quiz("Who won the 2006 World Cup?");
        sportQuestion6.addChoice("Italy",0);
        sportQuestion6.addChoice("Germany",1);
        sportQuestion6.addChoice("France",2);
        sportQuestion6.addChoice("Brazil");
        I = 0;
        Sports.enqueue(sportQuestion6.Question, sportQuestion6.choices, I);

        Quiz sportQuestion7 = new Quiz("In Football,how many players is each team made of?");
        sportQuestion7.addChoice("11",0);
        sportQuestion7.addChoice("12",1);
        sportQuestion7.addChoice("9",2);
        sportQuestion7.addChoice("5");
        I = 0;
        Sports.enqueue(sportQuestion7.Question, sportQuestion7.choices, I);

        Quiz sportQuestion8 = new Quiz("How long are olympic swimming pools");
        sportQuestion8.addChoice("50m",0);
        sportQuestion8.addChoice("25m",1);
        sportQuestion8.addChoice("30m",2);
        sportQuestion8.addChoice("40m");
        I = 0;
        Sports.enqueue(sportQuestion8.Question, sportQuestion8.choices, I);
        Quiz sportQuestion9 = new Quiz("Who is the fastest man alive?");
        sportQuestion9.addChoice("Usain bolt",0);
        sportQuestion9.addChoice("Yohan Blake",1);
        sportQuestion9.addChoice("Justin Galtin",2);
        sportQuestion9.addChoice("Christian Coleman");
        I = 0;
        Sports.enqueue(sportQuestion9.Question, sportQuestion9.choices, I);

        Quiz sportQuestion10 = new Quiz("Who won the most NBA trophies?");
        sportQuestion10.addChoice("Usain bolt",0);
        sportQuestion10.addChoice("Magic Johnson",1);
        sportQuestion10.addChoice("Kobe Bryant",2);
        sportQuestion10.addChoice("Chris Bosh");
        I = 0;
        Sports.enqueue(sportQuestion10.Question, sportQuestion9.choices, I);

        qHolder.insertAtFront(Sports);

        Queue History = new Queue("History");
        Quiz historyQuestion = new Quiz("What year did WW2 start?");
        historyQuestion.addChoice("1939",0);
        historyQuestion.addChoice("1937",1);
        historyQuestion.addChoice("1941",2);
        historyQuestion.addChoice("1936");
        I = 0;
        History.enqueue(historyQuestion.Question, historyQuestion.choices, I);

        Quiz historyQuestion2 = new Quiz("When did the golden age of Islam start?");
        historyQuestion2.addChoice("8th century",0);
        historyQuestion2.addChoice("7th century",1);
        historyQuestion2.addChoice("10th century",2);
        historyQuestion2.addChoice("11th century");
        I = 0;
        History.enqueue(historyQuestion2.Question, historyQuestion2.choices, I);

        Quiz historyQuestion3= new Quiz("What country does not have an independence day?");
        historyQuestion3.addChoice("England",0);
        historyQuestion3.addChoice("France",1);
        historyQuestion3.addChoice("USA",2);
        historyQuestion3.addChoice("India");
        I = 0;
        History.enqueue(historyQuestion3.Question, historyQuestion3.choices, I);

        Quiz historyQuestion4= new Quiz("How many European crusades were there to claim the holy land?");
        historyQuestion4.addChoice("8",0);
        historyQuestion4.addChoice("11",1);
        historyQuestion4.addChoice("6",2);
        historyQuestion4.addChoice("9");
        I = 0;
        History.enqueue(historyQuestion4.Question, historyQuestion4.choices, I);

        Quiz historyQuestion5 = new Quiz("Who is the last Roman Emperor?");
        historyQuestion5.addChoice("Romulus",0);
        historyQuestion5.addChoice("Augustun",1);
        historyQuestion5.addChoice("Trajan",2);
        historyQuestion5.addChoice("Aurelius");
        I = 0;
        History.enqueue(historyQuestion5.Question, historyQuestion5.choices, I);

        Quiz historyQuestion6 = new Quiz("How long did the Ottoman Empire rule?");
        historyQuestion6.addChoice("600 years",0);
        historyQuestion6.addChoice("400 years",1);
        historyQuestion6.addChoice("500 years",2);
        historyQuestion6.addChoice("1000 years");
        I = 0;
        History.enqueue(historyQuestion6.Question, historyQuestion6.choices, I);

        Quiz historyQuestion7 = new Quiz("What year was the Kingdom of Saudi Arabia fouded?");
        historyQuestion7.addChoice("1932",0);
        historyQuestion7.addChoice("1933",1);
        historyQuestion7.addChoice("1943",2);
        historyQuestion7.addChoice("1900");
        I = 0;
        History.enqueue(historyQuestion7.Question, historyQuestion7.choices, I);

        Quiz historyQuestion8 = new Quiz("When did the Soviet Union collapse");
        historyQuestion8.addChoice("1990",0);
        historyQuestion8.addChoice("1890",1);
        historyQuestion8.addChoice("2000",2);
        historyQuestion8.addChoice("1950");
        I = 0;
        History.enqueue(historyQuestion8.Question, historyQuestion8.choices, I);

        Quiz historyQuestion9 = new Quiz("Who is the first president of Lebanon after independence?");
        historyQuestion9.addChoice("Bechara Al-Khoury",0);
        historyQuestion9.addChoice("Fouad Chehab",1);
        historyQuestion9.addChoice("Camille Chamoun",2);
        historyQuestion9.addChoice("Elias Sarkis");
        I = 0;
        History.enqueue(historyQuestion9.Question, historyQuestion9.choices, I);

        Quiz historyQuestion10 = new Quiz("When did the six-day war start?");
        historyQuestion10.addChoice("1967",0);
        historyQuestion10.addChoice("1975",1);
        historyQuestion10.addChoice("1969",2);
        historyQuestion10.addChoice("1948");
        I = 0;
        History.enqueue(historyQuestion10.Question, historyQuestion10.choices, I);
        qHolder.insertAtFront(History);

        Queue Tech = new Queue("Tech");
        Quiz techQuestion = new Quiz("Who introduced the original iPhone in 2007?");
        techQuestion.addChoice("Steve Jobs",0);
        techQuestion.addChoice("Tim Cook",1);
        techQuestion.addChoice("Eddy Cue",2);
        techQuestion.addChoice("Phil Schiller");
        I = 0;
        Tech.enqueue(techQuestion.Question, techQuestion.choices, I);

        Quiz techQuestion2 = new Quiz("What is the best-selling video game console of all time?");
        techQuestion2.addChoice("PS2",0);
        techQuestion2.addChoice("Nintendo DS",1);
        techQuestion2.addChoice("Xbox 360",2);
        techQuestion2.addChoice("Wii");
        I = 0;
        Tech.enqueue(techQuestion2.Question, techQuestion2.choices, I);

        Quiz techQuestion3 = new Quiz("What resolution is considred 4K?");
        techQuestion3.addChoice("2160x3840",0);
        techQuestion3.addChoice("1440x2560",1);
        techQuestion3.addChoice("1080x1920",2);
        techQuestion3.addChoice("720x1280");
        I = 0;
        Tech.enqueue(techQuestion3.Question, techQuestion3.choices, I);

        Quiz techQuestion4 = new Quiz("What is the data transfer speed of USB 2.0?");
        techQuestion4.addChoice("60 mb",0);
        techQuestion4.addChoice("40 mb",1);
        techQuestion4.addChoice("20 mb",2);
        techQuestion4.addChoice("50 mb");
        I = 0;
        Tech.enqueue(techQuestion4.Question, techQuestion4.choices, I);

        Quiz techQuestion5= new Quiz("What is the newest Nvidia graphics card series?");
        techQuestion5.addChoice("3000 series",0);
        techQuestion5.addChoice("1000 series",1);
        techQuestion5.addChoice("900 series",2);
        techQuestion5.addChoice("2000 series");
        I = 0;
        Tech.enqueue(techQuestion5.Question, techQuestion5.choices, I);

        Quiz techQuestion6 = new Quiz("Who is the owner of Whatsapp?");
        techQuestion6.addChoice("Mark Zuckerburg",0);
        techQuestion6.addChoice("Jeff Bezoz",1);
        techQuestion6.addChoice("Bill gates",2);
        techQuestion6.addChoice("Elon Musk");
        I = 0;

        Tech.enqueue(techQuestion6.Question,techQuestion6.choices, I);

        Quiz techQuestion7 = new Quiz("What is the latest Windows OS?");
        techQuestion7.addChoice("Windows 11",0);
        techQuestion7.addChoice("Windows XP",1);
        techQuestion7.addChoice("Windows Vista",2);
        techQuestion7.addChoice("Windows 10");
        I = 0;
        Tech.enqueue(techQuestion7.Question, techQuestion7.choices, I);

        Quiz techQuestion8 = new Quiz("What company owns Google");
        techQuestion8.addChoice("Alphabet",0);
        techQuestion8.addChoice("Apple",1);
        techQuestion8.addChoice("Amazon",2);
        techQuestion8.addChoice("Meta");
        I = 0;
        Tech.enqueue(techQuestion8.Question, techQuestion8.choices, I);

        Quiz techQuestion9 = new Quiz("When was Facebook founded?");
        techQuestion9.addChoice("2004",0);
        techQuestion9.addChoice("2005",1);
        techQuestion9.addChoice("2006",2);
        techQuestion9.addChoice("1996");
        I = 0;
        Tech.enqueue(techQuestion9.Question, techQuestion9.choices, I);

        Quiz techQuestion10 = new Quiz("Bill Gates is the founder of?");
        techQuestion10.addChoice("Microsoft",0);
        techQuestion10.addChoice("Youtube",1);
        techQuestion10.addChoice("Yahoo",2);
        techQuestion10.addChoice("Samsung");
        I = 0;
        Tech.enqueue(techQuestion10.Question,techQuestion10.choices, I);
        qHolder.insertAtFront(Tech);

        Queue Health = new Queue("Health");
        Quiz healthQuestion = new Quiz("How do we maintain brain health?");
        healthQuestion.addChoice("Menatal Exercise",0);
        healthQuestion.addChoice("Physical Activity",1);
        healthQuestion.addChoice("Nutricious Food",2);
        healthQuestion.addChoice("Fresh Air");
        I = 0;
        Health.enqueue(healthQuestion.Question, healthQuestion.choices, I);

        Quiz healthQuestion2 = new Quiz("What is the leading cause of death?");
        healthQuestion2.addChoice("Heart Disease",0);
        healthQuestion2.addChoice("Cancer",1);
        healthQuestion2.addChoice("Suicide",2);
        healthQuestion2.addChoice("Chronic Back Pain");
        I = 0;
        Health.enqueue(healthQuestion2.Question, healthQuestion2.choices, I);

        Quiz healthQuestion3 = new Quiz("What is a healthy BMI?");
        healthQuestion3.addChoice("21",0);
        healthQuestion3.addChoice("35",1);
        healthQuestion3.addChoice("16",2);
        healthQuestion3.addChoice("27");
        I = 0;
        Health.enqueue(healthQuestion3.Question, healthQuestion3.choices, I);

        Quiz healthQuestion4 = new Quiz("What is the smallest bone in the human body?");
        healthQuestion4.addChoice("Ear",0);
        healthQuestion4.addChoice("Toes",1);
        healthQuestion4.addChoice("Chin",2);
        healthQuestion4.addChoice("Hand");
        I = 0;
        Health.enqueue(healthQuestion4.Question, healthQuestion4.choices, I);

        Quiz healthQuestion5 = new Quiz("An  ____ a day,keeps the Doctor away?");
        healthQuestion5.addChoice("Apple",0);
        healthQuestion5.addChoice("Apricot",1);
        healthQuestion5.addChoice("Avocado",2);
        healthQuestion5.addChoice("Eggplant");
        I = 0;
        Health.enqueue(healthQuestion5.Question, healthQuestion5.choices, I);

        Quiz healthQuestion6 = new Quiz("Number of bones in the human body?");
        healthQuestion6.addChoice("206",0);
        healthQuestion6.addChoice("208",1);
        healthQuestion6.addChoice("306",2);
        healthQuestion6.addChoice("128");
        I = 0;
        Health.enqueue(healthQuestion6.Question, healthQuestion6.choices, I);

        Quiz healthQuestion7 = new Quiz("What is the strongest muscle in the body?");
        healthQuestion7.addChoice("Tongue",0);
        healthQuestion7.addChoice("Neck",1);
        healthQuestion7.addChoice("Heart",2);
        healthQuestion7.addChoice("Arm");
        I = 0;
        Health.enqueue(healthQuestion7.Question, healthQuestion7.choices, I);

        Quiz healthQuestion8 = new Quiz("The body contains almost _____");
        healthQuestion8.addChoice("100 trillion cells",0);
        healthQuestion8.addChoice("200 trillion cells",1);
        healthQuestion8.addChoice("100 billion cells",2);
        healthQuestion8.addChoice("500 billion cells");
        I = 0;
        Health.enqueue(healthQuestion8.Question, healthQuestion8.choices, I);

        Quiz healthQuestion9 = new Quiz("The left lung is divided to _____ ?");
        healthQuestion9.addChoice("2 lobes",0);
        healthQuestion9.addChoice("3 lobes",1);
        healthQuestion9.addChoice("1 lobes",2);
        healthQuestion9.addChoice("4 lobes");
        I = 0;
        Health.enqueue(healthQuestion9.Question, healthQuestion9.choices, I);

        Quiz healthQuestion10 = new Quiz("How many senses does the human body have?");
        healthQuestion10.addChoice("5",0);
        healthQuestion10.addChoice("6",1);
        healthQuestion10.addChoice("4",2);
        healthQuestion10.addChoice("7");
        I = 0;
        Health.enqueue(healthQuestion10.Question, healthQuestion10.choices, I);
        qHolder.insertAtFront(Health);


        Queue Social = new Queue("Social");
        Quiz socialQuestion = new Quiz("The famous show \"Squid Game\" is set in which country ?");
        socialQuestion.addChoice("South Korea",0);
        socialQuestion.addChoice("Japan",1);
        socialQuestion.addChoice("China",2);
        socialQuestion.addChoice("Pakistan");
        I = 0;
        Social.enqueue(socialQuestion.Question, socialQuestion.choices, I);

        Quiz socialQuestion2 = new Quiz("What year was the ice bucket challenge?");
        socialQuestion2.addChoice("2014",0);
        socialQuestion2.addChoice("2017",1);
        socialQuestion2.addChoice("2016",2);
        socialQuestion2.addChoice("2012");
        I = 0;
        Social.enqueue(socialQuestion2.Question, socialQuestion2.choices, I);

        Quiz socialQuestion3 = new Quiz("The highest grossing film of all time is: ?");
        socialQuestion3.addChoice("Avengers Endgame",0);
        socialQuestion3.addChoice("Fast and Furious",1);
        socialQuestion3.addChoice("Avatar",2);
        socialQuestion3.addChoice("Joker");
        I = 0;
        Social.enqueue(socialQuestion3.Question, socialQuestion3.choices, I);

        Quiz socialQuestion4 = new Quiz("Who has the most instagram followers ever?");
        socialQuestion4.addChoice("Cristiano Ronaldo",0);
        socialQuestion4.addChoice("The Rock",1);
        socialQuestion4.addChoice("Selena Gomez",2);
        socialQuestion4.addChoice("Lionel Messi");
        I = 0;
        Social.enqueue(socialQuestion4.Question, socialQuestion4.choices, I);

        Quiz socialQuestion5 = new Quiz("The most popular social media platform is: ?");
        socialQuestion5.addChoice("Facebook",0);
        socialQuestion5.addChoice("Instagram",1);
        socialQuestion5.addChoice("Tiktok",2);
        socialQuestion5.addChoice("Twitter");
        I = 0;
        Social.enqueue(socialQuestion5.Question, socialQuestion5.choices, I);

        Quiz socialQuestion6 = new Quiz("What's the most popular show on Netflix of all time?");
        socialQuestion6.addChoice("Squid Game",0);
        socialQuestion6.addChoice("Money Heist",1);
        socialQuestion6.addChoice("Peaky Blinders",2);
        socialQuestion6.addChoice("Stranger Things");
        I = 0;
        Social.enqueue(socialQuestion6.Question, socialQuestion6.choices, I);

        Quiz socialQuestion7 = new Quiz("What is the most popular streaming service?");
        socialQuestion7.addChoice("Netlix",0);
        socialQuestion7.addChoice("Netlix",0);
        socialQuestion7.addChoice("Disney+",0);
        socialQuestion7.addChoice("Hulu");
        I = 0;
        Social.enqueue(socialQuestion7.Question, socialQuestion7.choices, I);



        Quiz socialQuestion8 = new Quiz("What social media platform uses only audio?");
        socialQuestion8.addChoice("Clubhouse",0);
        socialQuestion8.addChoice("Whatsapp",1);
        socialQuestion8.addChoice("iMessage",2);
        socialQuestion8.addChoice("Telegram");
        I = 0;
        Social.enqueue(socialQuestion8.Question, socialQuestion8.choices, I);

        Quiz socialQuestion9 = new Quiz("What social media platform did Elon Musk promote?");
        socialQuestion9.addChoice("Signal",0);
        socialQuestion9.addChoice("Whatsapp",1);
        socialQuestion9.addChoice("Twitter",2);
        socialQuestion9.addChoice("Youtube");
        I = 0;
        Social.enqueue(socialQuestion9.Question, socialQuestion9.choices, I);

        Quiz socialQuestion10 = new Quiz("What song has the most views on Youtube?");
        socialQuestion10.addChoice("Baby Shark",0);
        socialQuestion10.addChoice("Despacito",1);
        socialQuestion10.addChoice("See You Again",2);
        socialQuestion10.addChoice("Shape Of You");
        I = 0;
        Social.enqueue(socialQuestion10.Question, socialQuestion10.choices, I);

        qHolder.insertAtFront(Social);
        Actions(Sports, History, Tech, Health, Social);
        System.out.println("Would you like to return to main menu?(y or n)");
        char ans = Input.next().charAt(0);
        return ans;
    }
    public static void Actions(Queue Sports, Queue History, Queue Tech, Queue Health, Queue Social) {
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        CheckAnswers S;
        if (a == 1) {
            S = new CheckAnswers(Sports);

        } else if (a == 2) {
            S = new CheckAnswers(History);
        } else if (a == 3) {
            S = new CheckAnswers(Tech);
        } else if (a == 4) {
            S = new CheckAnswers(Health);
        } else if (a == 5) {
            S = new CheckAnswers(Social);
        }
    }
    void display(){
        System.out.println("Welcome to the quiz application");
        System.out.println("Are you a Teacher? (Y or N)");
        int option;
        Scanner console = new Scanner(System.in);
        char Teacher = console.next().charAt(0);
        if (Character.toUpperCase(Teacher)=='Y') {
            System.out.println("1-Create a Category ");
            System.out.println("2-Check the Grades");
            option = console.nextInt();


            if(option == 1) {
                System.out.println("Please name the category");
                String name = console.next();
                Queue xaxa= new Queue(name);
                System.out.println("How many questions you want to enter");
                int questionsNumber = console.nextInt();
                Quiz[] arr = new Quiz[questionsNumber];
                for (int i=0 ; i< arr.length; i++){
                    System.out.println("What is the question");
                    String question = console.next();
                    Quiz quiz  = new Quiz(question);
                    arr[i] = quiz;
                }


                for (int i = 0; i < arr.length; i++) {
                    System.out.println("What are the 4 choices that you want to enter for question => " + arr[i].Question);
                    for(int j = 0; j < 4 ; j++) {
                        System.out.println("Enter choice " + (j + 1));
                        String choice = console.next();
                        arr[i].addChoice(choice,j);
                    }
                    System.out.println("Which one is the correct answer");
                    String correctAnswer = console.next();
                    int correctIndex = 0;
                    for (int k=0; k<arr[i].choices.length; k++){
                        if (arr[i].choices[k].toLowerCase()==correctAnswer.toLowerCase()){
                            correctIndex= k;
                        }
                    }
                    xaxa.enqueue(arr[i].Question,arr[i].choices,correctIndex);

                }
                qHolder.insertAtFront(xaxa);

                char ans;
                do {
                    ans = createObjects(qHolder);
                } while (ans == 'y');
            }
            return;
        }
        else if (Character.toUpperCase(Teacher)=='N') {
            char ans;
            do {
                System.out.println("Welcome to the quiz application!"
                + "\nPlease choose a category to start answering the quiz questions\nCategories:\n1-Sports"
                + "\n2-History\n3-Tech\n4-Health\n5-Social\n---------------------------");
                ans = createObjects(qHolder);
            } while (ans == 'y');
            return;
        }


    }
    }

