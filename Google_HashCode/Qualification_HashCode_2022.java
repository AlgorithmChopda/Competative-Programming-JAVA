/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google_HashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */

class item{
    HashMap<String, Integer> skills = new HashMap<>();
    void add(String name, int score){
        this.skills.put(name, score);
    }
}

class People{
    item pep;
    String name;
    public People(String name , item pep){
        this.name = name;
        this.pep = pep;
    }
    public void add(String name, int score){
        this.pep.skills.put(name, score);
    }
}
class Project{
    item req;
    String name;
    int days_required;
    int score;
    int best_before;
    int people_required;

    public Project(String name, int days_required, int score, int best_before, int people_required) {
        this.name = name;
        this.days_required = days_required;
        this.score = score;
        this.best_before = best_before;
        this.people_required = people_required;
        req = new item();
    }
    
    public void add(String name, int score){
        this.req.skills.put(name, score);
    }
}

public class Qualification_HashCode_2022 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int project = sc.nextInt();
        
        ArrayList<People> con = new ArrayList<>();
        for(int i = 0 ; i < people ; i++){
            String name = sc.next();
            int length = sc.nextInt();
            item temp = new item();
            for(int j = 0 ; j < length ; j++)
                temp.add(sc.next(), sc.nextInt());
            con.add(new People(name, temp));
        }
        
        ArrayList<Project> projects = new ArrayList<>();
        for(int i = 0 ; i < project ; i++){
            projects.add(new Project(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
            Project cur = projects.get(i);
            int len = cur.people_required;
            for(int j = 0 ; j < len ; j++)
                cur.add(sc.next(), sc.nextInt());
            
        }
        
        
        
        
        int p_l = projects.size();
        
        HashMap<String, ArrayList<String>> op = new HashMap<>();
        
        for(Project p : projects){
            item i = p.req;
            HashMap<String, Integer> list_items = i.skills;
            ArrayList<String> project_skills = new ArrayList<>();
            
            for(Map.Entry pair : list_items.entrySet()){
                String name = (String) pair.getKey(); // required skill name
                int level = (int) pair.getValue();        // required level
                
                for(People pl : con){
                    item j = pl.pep;
                    HashMap<String, Integer> list_skills = j.skills;
                    
                    for(Map.Entry e : list_skills.entrySet()){
                        String s_name = (String) e.getKey();
                        int s_val = (int) e.getValue();
                        
                        if(name.equals(s_name) && level <= s_val){
                            project_skills.add(pl.name);
                        }
                        
                    }
                    
                }
                
            }
            if(project_skills.size() > 0){
                op.put(p.name, project_skills);
            }
            
        }
        
        
        System.out.println(op.size());
        for(Map.Entry pair : op.entrySet()){
            System.out.println(pair.getKey());
            ArrayList<String> names = (ArrayList<String>) pair.getValue();
            for(String name : names){
               System.out.print(name+" ");
            }
            System.out.println();
        }
        
        /*
        3 3
Anna 1
C++ 2
Bob 2
HTML 5
CSS 5
Maria 1
Python 3
Logging 5 10 5 1
C++ 3
WebServer 7 10 7 2
HTML 3
C++ 2
WebChat 10 20 20 2
Python 3
HTML 3
        */
        
        
        
        /*
        3
WebServer
Bob Anna
Logging
Anna
WebChat
Maria Bob
        */
        
        /*System.out.println("\n\n\n\n");
        for(Map.Entry pair : con.entrySet()){
            System.out.println(pair.getKey());
            item temp = (item) pair.getValue();
            for(Map.Entry val : temp.skills.entrySet()){
               System.out.println(val.getKey() + " : " +val.getValue());
            }       
        }    
        
        System.out.println("\n\n\n\n");
        for(Project val : projects){
            System.out.println(val.name+ " : "+val.score+" : "+val.days_required);
        }*/
        
        
        
        
        
    }
}
