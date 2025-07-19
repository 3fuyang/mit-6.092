package lec3.assn;

class Marathon {
  public static void main(String[] arguments) {
    String[] names = {
        "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
        "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
        "Aaron", "Kate"
    };

    int[] times = {
        341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
        343, 317, 265
    };

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + ": " + times[i]);
    }

    int bestIndex = getBestIndex(names, times);
    int secondBestIndex = getSecondBestIndex(names, times);

    System.out.println("The best performer is " + names[bestIndex] + ": " + times[bestIndex]);
    System.out.println("The second-best performer is " + names[secondBestIndex] + ": " + times[secondBestIndex]);
  }

  public static int getBestIndex(String[] names, int[] times) {
    int bestIndex = -1;
    int bestTime = Integer.MAX_VALUE;

    for (int i = 0; i < names.length; i++) {
      if (times[i] < bestTime) {
        bestTime = times[i];
        bestIndex = i;
      }
    }

    return bestIndex;
  }

  public static int getSecondBestIndex(String[] names, int[] times) {
    int bestIndex = getBestIndex(names, times);

    int secondBestIndex = -1;
    int secondBestTime = Integer.MAX_VALUE;

    for (int i = 0; i < names.length; i++) {
      if (i == bestIndex) {
        continue;
      }

      if (times[i] < secondBestTime) {
        secondBestIndex = i;
        secondBestTime = times[i];
      }
    }

    return secondBestIndex;
  }
}