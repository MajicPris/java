package work;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class proj {
	
	 class typeContent {
		 private  ArrayList<content> type;
		 private int id_of_type;
		 private String name_of_type;
		 
		 public typeContent(){
			 id_of_type = 0;
			 name_of_type = new String();
		 }
		 

		public ArrayList<content> getType() {
			return type;
		}

		public void setType(ArrayList<content> type) {
			this.type = type;
		}

		public int getId_of_type() {
			return id_of_type;
		}

		public void setId_of_type(int id_of_type) {
			this.id_of_type = id_of_type;
		}

		public String getName_of_type() {
			return name_of_type;
		}

		public void setName_of_type(String name_of_type) {
			this.name_of_type = name_of_type;
		}
			
	 }
	 
	 class content extends book{
		 private int id_of_content;
		 private String name_of_content;
		 
		 public content(){
			 id_of_content = 0;
			 name_of_content = new String();
		 }
	 }
	 
	 class person{
		 private int  id_of_person;
		 private String first_name;
		 private String second_name;
		 private String third_name;
		 
		 public person(){
			 first_name = new String();
			 second_name = new String();
			 third_name = new String();
			 id_of_person = 0;
		 }
		 
		 
		 public int get_id_of_person() {
			 return id_of_person;
		 }
		 public void set_id_of_person (int id_of_person) {
			 this.id_of_person = id_of_person;
		 }
		 public String get_first_name() {
			 return first_name;
		 }
		 public void set_first_name (String first_name) {
			 this.first_name = first_name;
		 }
		 public String get_second_name() {
			 return second_name;
		 }
		 public void set_second_name (String second_name) {
			 this.second_name = second_name;
		 }
		 public String get_third_name() {
			 return third_name;
		 }
		 public void set_third_name (String third_name) {
			 this.third_name = third_name;
		 }		 
		 
	 }
	 
	 class author extends person {
		 private String genre;
		 
		 public author()
		 {
			 genre = new String();
		 }
		 
		 public String get_genre(){
			 return genre;
		 }
		 public void set_genre(String genre){
			 this.genre = genre;
		 }
	 }
	 
	 class book{
		 private int count;
		 author author; 
		 book(){
			 count = 0;
		 }
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		 
	 }

	 public static void main(String arg[])
	 {
		 
	 }
}

