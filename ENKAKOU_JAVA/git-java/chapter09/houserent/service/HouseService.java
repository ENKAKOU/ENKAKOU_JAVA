package chapter09.houserent.service;

import chapter09.houserent.domain.House;

public class   HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        //new houses
        houses = new House[size];
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    //findById方法,返回House对象或者null
    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }
    
    public boolean del(int deliId) {
        int index = -1;
        for(int i = 0; i < houseNums; i++) {
            if(deliId == houses[i].getId()) {
                index = i;
            }
        }
        if(index == -1) {
            return false;
        }
        for(int i = index; i < houseNums -1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    public boolean add(House newHouse) {
        if(houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了..");
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list() {
        return houses;

    }
}
