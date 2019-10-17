int makeArrayConsecutive2(int[] statues) {
    // the largest and smallest statue always start being the first element.
    int largest = statues[0];
    int smallest = statues[0];
    for (int i = 0; i < statues.length; i++) {
       if (statues[i] > largest)
          largest = statues[i];
       
       if (statues[i] < smallest)
          smallest = statues[i];
    }
    return 1 + largest - smallest - statues.length;
 }