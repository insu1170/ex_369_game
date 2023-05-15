package gugu1;

public class StringConcatenation {
	
	  
	    	  public static void main(String[] args) {
	    	        int n = 100;  // 게임이 끝날 숫자를 지정합니다.

	    	        for (int i = 1; i <= n; i++) {
	    	            if (contains369(i) == 2) {
	    	                System.out.println("짝짝");
	    	            } else if (contains369(i) == 1) {
	    	                System.out.println("짝");
	    	            } else {
	    	                System.out.println(i);
	    	            }
	    	        }
	    	    }

	    	    public static int contains369(int num) {
	    	        int count = 0;
	    	        while (num > 0) {
	    	            int digit = num % 10;
	    	            if (digit == 3 || digit == 6 || digit == 9) {
	    	                count++;
	    	            }
	    	            num /= 10;
	    	        }
	    	        return count;
	    	    }
	    	}