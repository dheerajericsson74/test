package com.ericsson.enums;

public enum MovieGenere {
	ACTION(15){
		boolean isKidFriendly(int age) {
			return age >=minAgeToWatch;
		}
	},
	COMEDY(12){
		boolean isKidFriendly(int age) {
			return age >=minAgeToWatch;
		}
	},
	HORROR(18){
		boolean isKidFriendly(int age) {
			return false;
		}
	},
	THIRLLER(15){
		boolean isKidFriendly(int age) {
			return age >=minAgeToWatch;
		}
	},
	BIOGRAPHY(12){
		boolean isKidFriendly(int age) {
			return age >=minAgeToWatch;
		}
	},
	HISTORY(12){
		boolean isKidFriendly(int age) {
			return age >=minAgeToWatch;
		}
	};
	
	
	abstract boolean isKidFriendly(int age);//OPtional
	
	private MovieGenere(int minAgeToWatch) {
		this.minAgeToWatch =minAgeToWatch;
	}
	
	protected int minAgeToWatch;
	
	public int getMinAgeToWatch() {
		return minAgeToWatch;
	}
	
	public static void main(String[] args) {
		
		for(MovieGenere mt:MovieGenere.values()) {
			System.out.println("Name : "+mt.name()+" minAgeToWatch ->"+mt.minAgeToWatch+" this iskidFriendly --->"+mt.isKidFriendly(13));
			System.out.println("Ordinal : "+mt.ordinal());
			System.out.println("getDeclaringClass : "+mt.getDeclaringClass());
			System.out.println("compareTo(MovieGenere.ACTION: "+mt.compareTo(MovieGenere.ACTION));
			System.out.println("equals(MovieGenere.THIRLLER) : "+mt.equals(MovieGenere.THIRLLER));
			System.out.println("*******************************");
			System.out.println(" ");
		}
	}
}
