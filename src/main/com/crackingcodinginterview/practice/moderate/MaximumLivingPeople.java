package main.com.crackingcodinginterview.practice.moderate;

import java.util.*;

public class MaximumLivingPeople {

    public int calculateMaximumLivingPeople(List<Person> people){

        HashMap<Integer, Integer> birthYearCountMap = new HashMap<>();
        HashMap<Integer, Integer> deathYearCountMap = new HashMap<>();

        Set<Integer> birthYearSet = new HashSet<>();
        Set<Integer> deathYearSet = new HashSet<>();

        for(Person person : people){
            int bYear = person.getBirthYear();
            int dYear = person.getDeathYear();

            birthYearSet.add(bYear);
            if (dYear !=0) deathYearSet.add(dYear);

            //Adding to BirthYearMap
            if(birthYearCountMap.get(bYear) != null){
                birthYearCountMap.put(bYear, birthYearCountMap.get(bYear)+1);
            }else{
                birthYearCountMap.put(bYear, 1);
            }

            //Adding to DeathYearMap
            if(deathYearCountMap.get(dYear) != null){
                deathYearCountMap.put(dYear, deathYearCountMap.get(dYear)+1);
            }else{
                deathYearCountMap.put(dYear, 1);
            }
        }

        ArrayList<Integer> birthYearList = sortSet(birthYearSet);
        ArrayList<Integer> deathYearList = sortSet(deathYearSet);

        int maxPeopleCount = 0;
        int maxCountYear = 0;
        int totalPeopleNow = 0;
        int deathYearIdx =0;

        for(int birthYear : birthYearList){
            int peopleCount = birthYearCountMap.get(birthYear);
            int deathYear = deathYearList.get(deathYearIdx);

            if( deathYear <= birthYear){
                boolean isUpdated = false;
                while (deathYear <= birthYear){
                    int deathPeopleThisYear = deathYearCountMap.get(deathYear);

                    if(deathYear < birthYear){
                        totalPeopleNow -= deathPeopleThisYear;
                    }else{
                        totalPeopleNow += peopleCount;
                        if(maxPeopleCount < totalPeopleNow){
                            maxPeopleCount = totalPeopleNow;
                            maxCountYear = birthYear;
                        }
                        totalPeopleNow -= deathPeopleThisYear;
                        isUpdated = true;
                    }
                    deathYearIdx++;
                    deathYear = deathYearList.get(deathYearIdx);
                }

                if(!isUpdated){
                    totalPeopleNow += peopleCount;
                    if(maxPeopleCount < totalPeopleNow){
                        maxPeopleCount = totalPeopleNow;
                        maxCountYear = birthYear;
                    }
                }

            }else {
                totalPeopleNow += peopleCount;
                if(maxPeopleCount < totalPeopleNow){
                    maxPeopleCount = totalPeopleNow;
                    maxCountYear = birthYear;
                }
            }


        }
        return maxCountYear;
    }

    private ArrayList<Integer> sortSet(Set<Integer> yearSet) {

        ArrayList<Integer> list = new ArrayList<>(yearSet);

        Collections.sort(list);

        return list;
    }
}
