package by.bsuir.lab.tasks;

import by.bsuir.lab.common.Player;
import by.bsuir.lab.list.LinkedList;

public class Counter {

    private int steps = 10;
    private int k = 3;

    public Counter() {
    }

    public Counter(int steps, int k) {
        this.steps = steps;
        this.k = k;
    }

    public void play(LinkedList<Player> playerList) {
        int players = playerList.size();

        int j = 0;
        for (int i = 0; i < steps; i++) {

            if(playerList.size() == 0) {
                throw new IllegalArgumentException("Players not issue");
            }

            if (playerList.get(j) == null) {
                j = 0;
            }

            if (i % k == 0 && i != 0) {
                System.out.println(playerList.get(j) + " i: " + i);
                playerList.remove(playerList.get(j));
            }
            j++;
            players = playerList.size();
        }

    }
}
