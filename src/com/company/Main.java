package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	AlienXenomorph alienXenomorph = new AlienXenomorph();
	AlienXenomorph humanXenomorph = new HumanXenomorph(); // static class variable instance  = new constructor
	AlienXenomorph dogXenomorph = new DogXenomorph();
	AlienXenomorph predatorXenomorph = new PredatorXenomorph();
	DogXenomorph newDog = (DogXenomorph) dogXenomorph; //?????????????

	alienXenomorph.iAmAXenomorph();
	alienXenomorph.acidBlood();

	humanXenomorph.acidBlood();
	humanXenomorph.acidBlood();
	//humanXenomorph.walkLikeAHuman();// AlienXenomorph methods are the only methods that can be called because of ABOVE static class type references

	dogXenomorph.iAmAXenomorph();
	dogXenomorph.acidBlood();
	//dogXenomorph.walkLikeADog();

	predatorXenomorph.iAmAXenomorph();
	predatorXenomorph.acidBlood();
	//predatorXenomorph.biteLikeAPredator();

        HashMap<String,AlienXenomorph> alienMap = new HashMap<>();
//        alienMap.put((alienXenomorph.getClass().getSimpleName() alienXenomorph);
        alienMap.put("AlienXenomorph", alienXenomorph);
        alienMap.put("HumanXenomorph",humanXenomorph);
        alienMap.put("DogXenomorph", dogXenomorph);
        alienMap.put("PredatorXenomorph",predatorXenomorph);
        //foreach enter
        for (String s:alienMap.keySet()) {
            alienMap.get(s).iAmAXenomorph();
            if (alienMap.get(s) instanceof HumanXenomorph){
                ((HumanXenomorph)alienMap.get(s)).walkLikeAHuman();
            }
        }
        HashSet<AlienXenomorph> alienSet = new HashSet<>();

        alienSet.add(alienXenomorph);
        alienSet.add(humanXenomorph);
        alienSet.add(dogXenomorph);
        alienSet.add(predatorXenomorph);
        for (AlienXenomorph a:alienSet){
            a.iAmAXenomorph();
        }
    }
}
