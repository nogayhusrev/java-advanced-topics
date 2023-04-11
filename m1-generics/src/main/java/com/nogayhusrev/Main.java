package com.nogayhusrev;

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPLayer pat = new BaseBallPLayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");


        //Team liverpool = new Team("Liverpool"); // Team accept any player object
        Team<SoccerPlayer> liverpool = new Team("Liverpool"); // Team accept soccer player object
        //liverpool.addPlayer(joe); gives error
        liverpool.addPlayer(beckham);
        //liverpool.addPlayer(pat);  gives error


        //Team<String> brokenTeam = new Team<String>("What lind of team is this?");


    }


}
