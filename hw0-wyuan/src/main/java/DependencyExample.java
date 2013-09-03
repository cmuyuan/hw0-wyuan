import java.io.StringReader;
import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.objectbank.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;

/**
 * 9 * An example for Homework 0 of 11791 F13
 * 
 * 11 * @author Zi Yang <ziy@cs.cmu.edu>
 */
public class DependencyExample {
  /**
   * Tokenize a sentence in the argument, and print out 17 * the tokens to the console.
   * 
   * 19 * @param args Set the first argument as the sentence to 21 * be tokenized.
   */
  public static void main(String[] args) {
    TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
    Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(args[0]));
    System.out.println(tokenizer.tokenize());
  }
}