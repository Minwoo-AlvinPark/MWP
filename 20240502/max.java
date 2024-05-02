class Max {
  public static void main(String[] args) {
    int[] input = {45,3,5,3,2,25,6};
     
    System.out.println(findMax(input));
  }

  public static int findMax(int[] input) {
    int max = input[0];
    for(int i = 0; i < input.lenght; i++) {
      if(max < input[i]) {
        max = input[i];
      }
    }
    return max;
  }
}
