package entidades;

import java.time.LocalDate;

public class Event {
	   private String name;
	    private String category;
	    private LocalDate date;
	    private String location;
		public Event(String name, String category, LocalDate date, String location) {
			super();
			this.name = name;
			this.category = category;
			this.date = date;
			this.location = location;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		 // Getters and setters
	    
}
