import java.util.Set;

public class Main {

  private static final Set<Character> vowels = Set.of('a', 'A', 'o', 'O', 'u', 'U', 'e', 'E', 'i', 'I');

  /**
   * Traverse all characters from the input and check if on each iteration the character at the current index is any of
   * the uppercase/lowercase vowels.
   */
  public static boolean containsVowelBruteForce(String input) {
    if (input == null || input.length() == 0) {
      return false;
    }

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (c == 'a' || c == 'A' || c == 'o' || c == 'O' || c == 'u' || c == 'U' || c == 'e' || c == 'E' || c == 'i' || c == 'I') {
        return true;
      }
    }

    return false;
  }

  /**
   * Here we also traverse through all the characters within the string until a vowel is found or the end is reached.
   *
   * Since we're using a Set with all the uppercase & lowercase vowels, the checks within the for loop have time complexity of O(1).
   * Based on the first occurrence of the vowel it might visit only 1 element if it's in the beginning or all the elements, if it's in the end.
   *
   * The set is initialized when the class is loaded, not on each method call. This has better performance compared to the previous one,
   * thanks to the Set capabilities. Instead of performing multiple OR checks against each of the vowels each time, we only check if such key exists
   * in the map behind the set.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static boolean containsVowel(String input) {
    if (input == null || input.length() == 0) {
      return false;
    }

    for (int i = 0; i < input.length(); i++) {
      if (vowels.contains(input.charAt(i))) {
        return true;
      }
    }

    return false;
  }

  /**
   * A bit more optimal version which checks the character at the current index on the left side of the middle
   * and the character at the opposite position on the right side of the middle on each iteration and reduces the looped elements by half.
   *
   * <ol>
   *   <li>We need to account for the case when the input has an odd number of symbols and check the middle element also</li>
   *   <li>The check in the previous point also handles the case when the input has only 1 symbol</li>
   * </ol>
   *
   * Space Complexity O(1)
   * Time Complexity O(n)
   */
  public static boolean containsVowelOptimized(String input) {
    if (input == null || input.length() == 0) {
      return false;
    }

    int inputLength = input.length();
    int mid = inputLength / 2;

    if (inputLength % 2 == 1 && vowels.contains(input.charAt(mid))) {
      return true;
    }

    for (int i = 0; i < mid; i++) {
      int oppositePos = (inputLength - 1) - i;
      if (vowels.contains(input.charAt(i)) || vowels.contains(input.charAt(oppositePos))) {
        return true;
      }
    }

    return false;
  }
}
