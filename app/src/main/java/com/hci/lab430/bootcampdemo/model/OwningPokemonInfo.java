package com.hci.lab430.bootcampdemo.model;

/**
 * Created by lab430 on 16/8/17.
 */
public class OwningPokemonInfo {

    public final static int maxNumSkills = 4;
    public static String[] typeNames;

    public boolean isSelected = false;

    public int listImgId;
    public String name;
    public int level;
    public int currentHP;
    public int maxHP;

    //detail info
    public int detailImgId;
    public int type_1;
    public int type_2;

    public String[] skill = new String[maxNumSkills];
}
