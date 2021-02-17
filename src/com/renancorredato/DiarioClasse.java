package com.renancorredato;

import java.text.SimpleDateFormat;

import java.util.*;


public class DiarioClasse {
    public static void main(String args[]) {

        Calendar data = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(data.getTime()));
        System.out.println(" ");

            Map<String, String> map = new TreeMap<String, String>();

            map.put("A", "Alunos");


            System.out.println(map.get("A"));
            System.out.println(" ");


            List<String[]> diario = new ArrayList<String[]>();

            String[] Datas = {"05/03/2021    " + "06/03/2021    " + "07/03/2021 "};
            String[] Aula1 = {"presente      " + "ausente       " + "presente   "};
            String[] Aula2 = {"presente      " + "presente      " + "presente   "};
            String[] Aula3 = {"ausente       " + "ausente       " + "presente   "};


            diario.add(Datas);
            diario.add(Aula1);
            diario.add(Aula2);
            diario.add(Aula3);


            for (String[] classe : diario) {
                System.out.println("Alunos     " + Arrays.toString(classe));

            }


        }
    }


