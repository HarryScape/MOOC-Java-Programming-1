
public class Statistics {
    
    
        private int count;
        private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count += 1;
        this.sum = sum + number;
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    
      public int sum() {
        // write code here
        if (this.count == 0) {
            return 0;
        } else {
            return this.sum;
        }
    }
      
      public double average() {
          double average;
          if (this.count == 0) {
              return 0;
          } else {
              average = 1.0 * this.sum / this.count;
          }
          return average;
      }
    
    
    
    
}
