package DenemeGeneric;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
       Character[] char_dizi={'J','A','V','A'};
       Integer[] integer_dizi={1,2,3,4,5,6};
       String[] string_dizi={"Java","Phyton","C++","PHP"};
       Ogrenci [] ogrenci_dizi={new Ogrenci("Mustafa"),new Ogrenci("Coskun"),new Ogrenci("Merve")};
        System.out.println("****************************");
//       CharYazdir.yazdir(char_dizi);
//       StringYazdir.yazdir(string_dizi);
//       IntegerYazdir.yazdir(integer_dizi);
//       OgrenciYazdir.yazdir(ogrenci_dizi);

        YazdirmaSinifi<Character> yazdir_char=new YazdirmaSinifi<>();
        YazdirmaSinifi<String> yazdir_string=new YazdirmaSinifi<>();
        YazdirmaSinifi<Integer> yazdir_integer=new YazdirmaSinifi<>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci=new YazdirmaSinifi<>();

        yazdir_char.yazdir(char_dizi);
        yazdir_integer.yazdir(integer_dizi);
        yazdir_string.yazdir(string_dizi);
        yazdir_ogrenci.yazdir(ogrenci_dizi);

    }

    }

