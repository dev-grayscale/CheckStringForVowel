import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void containsBruteForce() {
    Assertions.assertTrue(Main.containsVowelBruteForce("test"));
    Assertions.assertTrue(Main.containsVowelBruteForce("hello"));
    Assertions.assertTrue(Main.containsVowelBruteForce("ffeff"));
    Assertions.assertTrue(Main.containsVowelBruteForce("atttlllmmnnnkkkjj"));
    Assertions.assertTrue(Main.containsVowelBruteForce("O"));
    Assertions.assertFalse(Main.containsVowelBruteForce("lllkkkmmnnnnbbvcxz"));
    Assertions.assertTrue(Main.containsVowelBruteForce("lllkkkmmnnnnbbvcxza"));
    Assertions.assertTrue(Main.containsVowelBruteForce("llUkkkmmnnnnbbvcxza"));
    Assertions.assertTrue(Main.containsVowelBruteForce("llkkkkmmnnnnbbvcIza"));
    Assertions.assertTrue(Main.containsVowelBruteForce("                     a"));
    Assertions.assertFalse(Main.containsVowelBruteForce("32187361276^&()(*#!@$^~|"));
    Assertions.assertFalse(Main.containsVowelBruteForce(""));
    Assertions.assertFalse(Main.containsVowelBruteForce("      "));
    Assertions.assertFalse(Main.containsVowelBruteForce(null));
  }

  @Test
  void containsVowel() {
    Assertions.assertTrue(Main.containsVowel("test"));
    Assertions.assertTrue(Main.containsVowel("hello"));
    Assertions.assertTrue(Main.containsVowel("ffeff"));
    Assertions.assertTrue(Main.containsVowel("atttlllmmnnnkkkjj"));
    Assertions.assertTrue(Main.containsVowel("O"));
    Assertions.assertFalse(Main.containsVowel("lllkkkmmnnnnbbvcxz"));
    Assertions.assertTrue(Main.containsVowel("lllkkkmmnnnnbbvcxza"));
    Assertions.assertTrue(Main.containsVowel("llUkkkmmnnnnbbvcxza"));
    Assertions.assertTrue(Main.containsVowel("llkkkkmmnnnnbbvcIza"));
    Assertions.assertTrue(Main.containsVowel("                     a"));
    Assertions.assertFalse(Main.containsVowel("32187361276^&()(*#!@$^~|"));
    Assertions.assertFalse(Main.containsVowel(""));
    Assertions.assertFalse(Main.containsVowel("      "));
    Assertions.assertFalse(Main.containsVowel(null));
  }

  @Test
  void containsVowelOptimized() {
    Assertions.assertTrue(Main.containsVowelOptimized("test"));
    Assertions.assertTrue(Main.containsVowelOptimized("hello"));
    Assertions.assertTrue(Main.containsVowelOptimized("ffeff"));
    Assertions.assertTrue(Main.containsVowelOptimized("atttlllmmnnnkkkjj"));
    Assertions.assertTrue(Main.containsVowelOptimized("O"));
    Assertions.assertFalse(Main.containsVowelOptimized("lllkkkmmnnnnbbvcxz"));
    Assertions.assertTrue(Main.containsVowelOptimized("lllkkkmmnnnnbbvcxza"));
    Assertions.assertTrue(Main.containsVowelOptimized("llUkkkmmnnnnbbvcxza"));
    Assertions.assertTrue(Main.containsVowelOptimized("llkkkkmmnnnnbbvcIza"));
    Assertions.assertTrue(Main.containsVowelOptimized("                     a"));
    Assertions.assertFalse(Main.containsVowelOptimized("32187361276^&()(*#!@$^~|"));
    Assertions.assertFalse(Main.containsVowelOptimized(""));
    Assertions.assertFalse(Main.containsVowelOptimized("      "));
    Assertions.assertFalse(Main.containsVowelOptimized(null));
  }
}
