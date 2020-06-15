package com.example.demo;

public class Test2  {
		
		
		
		public Test2(String date, String name) {
			super();
			this.date = date;
			this.name = name;
		}

		String date ;
		
		String name;

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Test2 [date=" + date + ", name=" + name + "]";
		}
		
		
	}