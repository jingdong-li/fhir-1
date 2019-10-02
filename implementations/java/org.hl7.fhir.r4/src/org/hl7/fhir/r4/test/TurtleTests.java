package org.hl7.fhir.r4.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.hl7.fhir.r4.test.support.TestingUtilities;
import org.hl7.fhir.r4.utils.formats.Turtle;
import org.hl7.fhir.utilities.TextFile;
import org.hl7.fhir.utilities.Utilities;
import org.junit.Test;

import junit.framework.Assert;

public class TurtleTests {



  private void doTest(String filename, boolean ok) throws Exception {
    try {
      String s = TextFile.fileToString(filename);
      Turtle ttl = new Turtle();
      ttl.parse(s);
      Assert.assertTrue(ok);
    } catch (Exception e) {
      Assert.assertTrue(e.getMessage(), !ok);
    }
  }

  @Test
  public void test_double_lower_case_e1() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "double_lower_case_e.nt"), true);
  }
  @Test
  public void test_double_lower_case_e2() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "double_lower_case_e.ttl"), true);
  }
  @Test
  public void test_empty_collection1() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "empty_collection.nt"), true);
  }
  @Test
  public void test_empty_collection2() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "empty_collection.ttl"), true);
  }
  @Test
  public void test_first1() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "first.nt"), true);
  }
//  @Test
//  public void test_first2() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "first.ttl"), true);
//  }
//  @Test
  public void test_HYPHEN_MINUS_in_localNameNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "HYPHEN_MINUS_in_localName.nt"), true);
  }
  @Test
  public void test_HYPHEN_MINUS_in_localName() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "HYPHEN_MINUS_in_localName.ttl"), true);
  }
  @Test
  public void test_IRI_spoNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "IRI_spo.nt"), true);
  }
  @Test
  public void test_IRI_subject() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "IRI_subject.ttl"), true);
  }
  @Test
  public void test_IRI_with_all_punctuationNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "IRI_with_all_punctuation.nt"), true);
  }
  @Test
  public void test_IRI_with_all_punctuation() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "IRI_with_all_punctuation.ttl"), true);
  }
  @Test
  public void test_IRI_with_eight_digit_numeric_escape() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "IRI_with_eight_digit_numeric_escape.ttl"), true);
  }
  @Test
  public void test_IRI_with_four_digit_numeric_escape() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "IRI_with_four_digit_numeric_escape.ttl"), true);
  }
  @Test
  public void test_IRIREF_datatypeNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "IRIREF_datatype.nt"), true);
  }
  @Test
  public void test_IRIREF_datatype() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "IRIREF_datatype.ttl"), true);
  }
  @Test
  public void test_labeled_blank_node_objectNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "labeled_blank_node_object.nt"), true);
  }
  @Test
  public void test_labeled_blank_node_object() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "labeled_blank_node_object.ttl"), true);
  }
  @Test
  public void test_labeled_blank_node_subjectNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "labeled_blank_node_subject.nt"), true);
  }
  @Test
  public void test_labeled_blank_node_subject() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "labeled_blank_node_subject.ttl"), true);
  }
  @Test
  public void test_labeled_blank_node_with_leading_digit() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "labeled_blank_node_with_leading_digit.ttl"), true);
  }
  @Test
  public void test_labeled_blank_node_with_leading_underscore() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "labeled_blank_node_with_leading_underscore.ttl"), true);
  }
  @Test
  public void test_labeled_blank_node_with_non_leading_extras() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "labeled_blank_node_with_non_leading_extras.ttl"), true);
  }
  @Test
  public void test_labeled_blank_node_with_PN_CHARS_BASE_character_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "labeled_blank_node_with_PN_CHARS_BASE_character_boundaries.ttl"), false);
  }
  @Test
  public void test_langtagged_LONG() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "langtagged_LONG.ttl"), true);
  }
  @Test
  public void test_langtagged_LONG_with_subtagNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "langtagged_LONG_with_subtag.nt"), true);
  }
  @Test
  public void test_langtagged_LONG_with_subtag() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "langtagged_LONG_with_subtag.ttl"), true);
  }
  @Test
  public void test_langtagged_non_LONGNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "langtagged_non_LONG.nt"), true);
  }
  @Test
  public void test_langtagged_non_LONG() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "langtagged_non_LONG.ttl"), true);
  }
  @Test
  public void test_lantag_with_subtagNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "lantag_with_subtag.nt"), true);
  }
  @Test
  public void test_lantag_with_subtag() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "lantag_with_subtag.ttl"), true);
  }
  @Test
  public void test_lastNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "last.nt"), true);
  }
  @Test
  public void test_last() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "last.ttl"), false);
  }
  @Test
  public void test_literal_falseNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_false.nt"), true);
  }
  @Test
  public void test_literal_false() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_false.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG1() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG1.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG1_ascii_boundariesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG1_ascii_boundaries.nt"), false);
  }
  @Test
  public void test_LITERAL_LONG1_ascii_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG1_ascii_boundaries.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG1_with_1_squoteNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG1_with_1_squote.nt"), true);
  }
  @Test
  public void test_LITERAL_LONG1_with_1_squote() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG1_with_1_squote.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG1_with_2_squotesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG1_with_2_squotes.nt"), true);
  }
  @Test
  public void test_LITERAL_LONG1_with_2_squotes() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG1_with_2_squotes.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG1_with_UTF8_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG1_with_UTF8_boundaries.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG2() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG2_ascii_boundariesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_ascii_boundaries.nt"), false);
  }
  @Test
  public void test_LITERAL_LONG2_ascii_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_ascii_boundaries.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG2_with_1_squoteNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_with_1_squote.nt"), true);
  }
  @Test
  public void test_LITERAL_LONG2_with_1_squote() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_with_1_squote.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG2_with_2_squotesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_with_2_squotes.nt"), true);
  }
  @Test
  public void test_LITERAL_LONG2_with_2_squotes() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_with_2_squotes.ttl"), true);
  }
  @Test
  public void test_LITERAL_LONG2_with_REVERSE_SOLIDUSNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_with_REVERSE_SOLIDUS.nt"), false);
  }
  @Test
  public void test_LITERAL_LONG2_with_REVERSE_SOLIDUS() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_with_REVERSE_SOLIDUS.ttl"), false);
  }
  @Test
  public void test_LITERAL_LONG2_with_UTF8_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_LONG2_with_UTF8_boundaries.ttl"), true);
  }
  @Test
  public void test_literal_trueNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_true.nt"), true);
  }
  @Test
  public void test_literal_true() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_true.ttl"), true);
  }
  @Test
  public void test_literal_with_BACKSPACENT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_BACKSPACE.nt"), false);
  }
  @Test
  public void test_literal_with_BACKSPACE() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_BACKSPACE.ttl"), true);
  }
  @Test
  public void test_literal_with_CARRIAGE_RETURNNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_CARRIAGE_RETURN.nt"), true);
  }
  @Test
  public void test_literal_with_CARRIAGE_RETURN() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_CARRIAGE_RETURN.ttl"), true);
  }
  @Test
  public void test_literal_with_CHARACTER_TABULATIONNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_CHARACTER_TABULATION.nt"), true);
  }
  @Test
  public void test_literal_with_CHARACTER_TABULATION() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_CHARACTER_TABULATION.ttl"), true);
  }
  @Test
  public void test_literal_with_escaped_BACKSPACE() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_escaped_BACKSPACE.ttl"), false);
  }
  @Test
  public void test_literal_with_escaped_CARRIAGE_RETURN() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_escaped_CARRIAGE_RETURN.ttl"), true);
  }
  @Test
  public void test_literal_with_escaped_CHARACTER_TABULATION() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_escaped_CHARACTER_TABULATION.ttl"), true);
  }
  @Test
  public void test_literal_with_escaped_FORM_FEED() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_escaped_FORM_FEED.ttl"), true);
  }
  @Test
  public void test_literal_with_escaped_LINE_FEED() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_escaped_LINE_FEED.ttl"), true);
  }
//  @Test
//  public void test_literal_with_FORM_FEEDNT() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_FORM_FEED.nt"), true);
//  }
  @Test
  public void test_literal_with_FORM_FEED() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_FORM_FEED.ttl"), true);
  }
  @Test
  public void test_literal_with_LINE_FEEDNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_LINE_FEED.nt"), true);
  }
  @Test
  public void test_literal_with_LINE_FEED() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_LINE_FEED.ttl"), true);
  }
  @Test
  public void test_literal_with_numeric_escape4NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_numeric_escape4.nt"), true);
  }
  @Test
  public void test_literal_with_numeric_escape4() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_numeric_escape4.ttl"), true);
  }
  @Test
  public void test_literal_with_numeric_escape8() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_numeric_escape8.ttl"), true);
  }
  @Test
  public void test_literal_with_REVERSE_SOLIDUSNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_REVERSE_SOLIDUS.nt"), false);
  }
  @Test
  public void test_literal_with_REVERSE_SOLIDUS() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "literal_with_REVERSE_SOLIDUS.ttl"), true);
  }
  @Test
  public void test_LITERAL_with_UTF8_boundariesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL_with_UTF8_boundaries.nt"), true);
  }
  @Test
  public void test_LITERAL1NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1.nt"), true);
  }
  @Test
  public void test_LITERAL1() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1.ttl"), true);
  }
  @Test
  public void test_LITERAL1_all_controlsNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1_all_controls.nt"), false);
  }
  @Test
  public void test_LITERAL1_all_controls() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1_all_controls.ttl"), true);
  }
  @Test
  public void test_LITERAL1_all_punctuationNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1_all_punctuation.nt"), true);
  }
  @Test
  public void test_LITERAL1_all_punctuation() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1_all_punctuation.ttl"), true);
  }
//  @Test
//  public void test_LITERAL1_ascii_boundariesNT() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1_ascii_boundaries.nt"), true);
//  }
  @Test
  public void test_LITERAL1_ascii_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1_ascii_boundaries.ttl"), true);
  }
  @Test
  public void test_LITERAL1_with_UTF8_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL1_with_UTF8_boundaries.ttl"), true);
  }
  @Test
  public void test_LITERAL2() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL2.ttl"), true);
  }
  @Test
  public void test_LITERAL2_ascii_boundariesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL2_ascii_boundaries.nt"), false);
  }
  @Test
  public void test_LITERAL2_ascii_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL2_ascii_boundaries.ttl"), true);
  }
  @Test
  public void test_LITERAL2_with_UTF8_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "LITERAL2_with_UTF8_boundaries.ttl"), true);
  }
  @Test
  public void test_localName_with_assigned_nfc_bmp_PN_CHARS_BASE_character_boundariesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_assigned_nfc_bmp_PN_CHARS_BASE_character_boundaries.nt"), true);
  }
  @Test
  public void test_localName_with_assigned_nfc_bmp_PN_CHARS_BASE_character_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_assigned_nfc_bmp_PN_CHARS_BASE_character_boundaries.ttl"), true);
  }
  @Test
  public void test_localName_with_assigned_nfc_PN_CHARS_BASE_character_boundariesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_assigned_nfc_PN_CHARS_BASE_character_boundaries.nt"), true);
  }
  @Test
  public void test_localName_with_assigned_nfc_PN_CHARS_BASE_character_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_assigned_nfc_PN_CHARS_BASE_character_boundaries.ttl"), false);
  }
// don't need to support property names with ':'
//  @Test
//  public void test_localname_with_COLONNT() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localname_with_COLON.nt"), true);
//  }
//  @Test
//  public void test_localname_with_COLON() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localname_with_COLON.ttl"), true);
//  }
  @Test
  public void test_localName_with_leading_digitNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_leading_digit.nt"), true);
  }
  @Test
  public void test_localName_with_leading_digit() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_leading_digit.ttl"), true);
  }
  @Test
  public void test_localName_with_leading_underscoreNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_leading_underscore.nt"), true);
  }
  @Test
  public void test_localName_with_leading_underscore() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_leading_underscore.ttl"), true);
  }
  @Test
  public void test_localName_with_nfc_PN_CHARS_BASE_character_boundariesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_nfc_PN_CHARS_BASE_character_boundaries.nt"), true);
  }
  @Test
  public void test_localName_with_nfc_PN_CHARS_BASE_character_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_nfc_PN_CHARS_BASE_character_boundaries.ttl"), false);
  }
  @Test
  public void test_localName_with_non_leading_extrasNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_non_leading_extras.nt"), true);
  }
  @Test
  public void test_localName_with_non_leading_extras() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "localName_with_non_leading_extras.ttl"), true);
  }
  @Test
  public void test_negative_numericNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "negative_numeric.nt"), true);
  }
  @Test
  public void test_negative_numeric() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "negative_numeric.ttl"), true);
  }
  @Test
  public void test_nested_blankNodePropertyListsNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "nested_blankNodePropertyLists.nt"), true);
  }
  @Test
  public void test_nested_blankNodePropertyLists() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "nested_blankNodePropertyLists.ttl"), true);
  }
  @Test
  public void test_nested_collectionNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "nested_collection.nt"), true);
  }
  @Test
  public void test_nested_collection() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "nested_collection.ttl"), false);
  }
  @Test
  public void test_number_sign_following_localNameNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "number_sign_following_localName.nt"), true);
  }
  @Test
  public void test_number_sign_following_localName() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "number_sign_following_localName.ttl"), true);
  }
  @Test
  public void test_number_sign_following_PNAME_NSNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "number_sign_following_PNAME_NS.nt"), true);
  }
//  @Test
//  public void test_number_sign_following_PNAME_NS() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "number_sign_following_PNAME_NS.ttl"), true);
//  }
  @Test
  public void test_numeric_with_leading_0NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "numeric_with_leading_0.nt"), true);
  }
  @Test
  public void test_numeric_with_leading_0() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "numeric_with_leading_0.ttl"), true);
  }
  @Test
  public void test_objectList_with_two_objectsNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "objectList_with_two_objects.nt"), true);
  }
  @Test
  public void test_objectList_with_two_objects() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "objectList_with_two_objects.ttl"), true);
  }
  @Test
  public void test_old_style_base() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "old_style_base.ttl"), true);
  }
  @Test
  public void test_old_style_prefix() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "old_style_prefix.ttl"), true);
  }
  @Test
  public void test_percent_escaped_localNameNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "percent_escaped_localName.nt"), true);
  }
//  @Test
//  public void test_percent_escaped_localName() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "percent_escaped_localName.ttl"), true);
//  }
  @Test
  public void test_positive_numericNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "positive_numeric.nt"), true);
  }
  @Test
  public void test_positive_numeric() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "positive_numeric.ttl"), true);
  }
  @Test
  public void test_predicateObjectList_with_two_objectListsNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "predicateObjectList_with_two_objectLists.nt"), true);
  }
  @Test
  public void test_predicateObjectList_with_two_objectLists() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "predicateObjectList_with_two_objectLists.ttl"), true);
  }
//  @Test
//  public void test_prefix_only_IRI() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "prefix_only_IRI.ttl"), true);
//  }
  @Test
  public void test_prefix_reassigned_and_usedNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "prefix_reassigned_and_used.nt"), true);
  }
  @Test
  public void test_prefix_reassigned_and_used() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "prefix_reassigned_and_used.ttl"), true);
  }
  @Test
  public void test_prefix_with_non_leading_extras() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "prefix_with_non_leading_extras.ttl"), true);
  }
  @Test
  public void test_prefix_with_PN_CHARS_BASE_character_boundaries() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "prefix_with_PN_CHARS_BASE_character_boundaries.ttl"), true);
  }
  @Test
  public void test_prefixed_IRI_object() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "prefixed_IRI_object.ttl"), true);
  }
  @Test
  public void test_prefixed_IRI_predicate() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "prefixed_IRI_predicate.ttl"), true);
  }
  @Test
  public void test_prefixed_name_datatype() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "prefixed_name_datatype.ttl"), true);
  }
  @Test
  public void test_repeated_semis_at_end() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "repeated_semis_at_end.ttl"), true);
  }
  @Test
  public void test_repeated_semis_not_at_endNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "repeated_semis_not_at_end.nt"), true);
  }
  @Test
  public void test_repeated_semis_not_at_end() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "repeated_semis_not_at_end.ttl"), true);
  }
  @Test
  public void test_reserved_escaped_localNameNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "reserved_escaped_localName.nt"), true);
  }
//  @Test
//  public void test_reserved_escaped_localName() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "reserved_escaped_localName.ttl"), true);
//  }
  @Test
  public void test_sole_blankNodePropertyList() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "sole_blankNodePropertyList.ttl"), true);
  }
  @Test
  public void test_SPARQL_style_base() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "SPARQL_style_base.ttl"), true);
  }
  @Test
  public void test_SPARQL_style_prefix() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "SPARQL_style_prefix.ttl"), true);
  }
  @Test
  public void test_turtle_eval_bad_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-eval-bad-01.ttl"), false);
  }
  @Test
  public void test_turtle_eval_bad_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-eval-bad-02.ttl"), false);
  }
  @Test
  public void test_turtle_eval_bad_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-eval-bad-03.ttl"), false);
  }
//  @Test
//  public void test_turtle_eval_bad_04() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-eval-bad-04.ttl"), false);
//  }
  @Test
  public void test_turtle_eval_struct_01NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-eval-struct-01.nt"), true);
  }
  @Test
  public void test_turtle_eval_struct_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-eval-struct-01.ttl"), true);
  }
  @Test
  public void test_turtle_eval_struct_02NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-eval-struct-02.nt"), true);
  }
  @Test
  public void test_turtle_eval_struct_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-eval-struct-02.ttl"), true);
  }
  @Test
  public void test_turtle_subm_01NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-01.nt"), true);
  }
  @Test
  public void test_turtle_subm_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-01.ttl"), true);
  }
  @Test
  public void test_turtle_subm_02NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-02.nt"), true);
  }
  @Test
  public void test_turtle_subm_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-02.ttl"), true);
  }
  @Test
  public void test_turtle_subm_03NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-03.nt"), true);
  }
  @Test
  public void test_turtle_subm_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-03.ttl"), false);
  }
  @Test
  public void test_turtle_subm_04NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-04.nt"), true);
  }
  @Test
  public void test_turtle_subm_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-04.ttl"), true);
  }
  @Test
  public void test_turtle_subm_05NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-05.nt"), true);
  }
  @Test
  public void test_turtle_subm_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-05.ttl"), true);
  }
  @Test
  public void test_turtle_subm_06NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-06.nt"), true);
  }
  @Test
  public void test_turtle_subm_06() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-06.ttl"), true);
  }
  @Test
  public void test_turtle_subm_07NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-07.nt"), true);
  }
  @Test
  public void test_turtle_subm_07() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-07.ttl"), false);
  }
  @Test
  public void test_NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-08.nt"), true);
  }
  @Test
  public void test_turtle_subm_08() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-08.ttl"), true);
  }
  @Test
  public void test_turtle_subm_09NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-09.nt"), true);
  }
  @Test
  public void test_turtle_subm_09() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-09.ttl"), true);
  }
  @Test
  public void test_turtle_subm_10NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-10.nt"), true);
  }
  @Test
  public void test_turtle_subm_10() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-10.ttl"), true);
  }
  @Test
  public void test_turtle_subm_11NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-11.nt"), true);
  }
  @Test
  public void test_turtle_subm_11() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-11.ttl"), true);
  }
  @Test
  public void test_turtle_subm_12NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-12.nt"), true);
  }
  @Test
  public void test_turtle_subm_12() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-12.ttl"), true);
  }
  @Test
  public void test_turtle_subm_13NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-13.nt"), true);
  }
  @Test
  public void test_turtle_subm_13() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-13.ttl"), true);
  }
  @Test
  public void test_turtle_subm_14NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-14.nt"), true);
  }
  @Test
  public void test_turtle_subm_14() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-14.ttl"), false);
  }
  @Test
  public void test_turtle_subm_15NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-15.nt"), true);
  }
  @Test
  public void test_turtle_subm_15() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-15.ttl"), true);
  }
  @Test
  public void test_turtle_subm_16NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-16.nt"), true);
  }
  @Test
  public void test_turtle_subm_16() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-16.ttl"), true);
  }
  @Test
  public void test_turtle_subm_17NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-17.nt"), true);
  }
  @Test
  public void test_turtle_subm_17() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-17.ttl"), true);
  }
  @Test
  public void test_turtle_subm_18NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-18.nt"), false);
  }
  @Test
  public void test_turtle_subm_18() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-18.ttl"), false);
  }
  @Test
  public void test_turtle_subm_19NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-19.nt"), true);
  }
  @Test
  public void test_turtle_subm_19() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-19.ttl"), true);
  }
  @Test
  public void test_turtle_subm_20NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-20.nt"), true);
  }
  @Test
  public void test_turtle_subm_20() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-20.ttl"), true);
  }
  @Test
  public void test_turtle_subm_21NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-21.nt"), true);
  }
  @Test
  public void test_turtle_subm_21() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-21.ttl"), true);
  }
  @Test
  public void test_turtle_subm_22NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-22.nt"), true);
  }
  @Test
  public void test_turtle_subm_22() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-22.ttl"), true);
  }
  @Test
  public void test_turtle_subm_23NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-23.nt"), true);
  }
  @Test
  public void test_turtle_subm_23() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-23.ttl"), false);
  }
  @Test
  public void test_turtle_subm_24NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-24.nt"), true);
  }
  @Test
  public void test_turtle_subm_24() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-24.ttl"), true);
  }
  @Test
  public void test_turtle_subm_25NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-25.nt"), true);
  }
  @Test
  public void test_turtle_subm_25() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-25.ttl"), true);
  }
  @Test
  public void test_turtle_subm_26NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-26.nt"), true);
  }
  @Test
  public void test_turtle_subm_26() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-26.ttl"), true);
  }
  @Test
  public void test_turtle_subm_27NT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-27.nt"), true);
  }
  @Test
  public void test_turtle_subm_27() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-subm-27.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_base_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-base-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_base_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-base-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_base_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-base-03.ttl"), false);
  }
//  @Test
//  public void test_turtle_syntax_bad_blank_label_dot_end() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-blank-label-dot-end.ttl"), false);
//  }
  @Test
  public void test_turtle_syntax_bad_esc_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-esc-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_esc_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-esc-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_esc_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-esc-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_esc_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-esc-04.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_kw_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-kw-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_kw_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-kw-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_kw_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-kw-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_kw_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-kw-04.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_kw_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-kw-05.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_lang_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-lang-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_LITERAL2_with_langtag_and_datatype() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-LITERAL2_with_langtag_and_datatype.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_ln_dash_start() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-ln-dash-start.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bad_ln_escape() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-ln-escape.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_ln_escape_start() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-ln-escape-start.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_missing_ns_dot_end() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-missing-ns-dot-end.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_missing_ns_dot_start() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-missing-ns-dot-start.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-04.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-05.ttl"), false);
  }
//  @Test
//  public void test_turtle_syntax_bad_n3_extras_06() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-06.ttl"), false);
//  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_07() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-07.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_08() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-08.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_09() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-09.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_10() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-10.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_11() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-11.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_12() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-12.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_n3_extras_13() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-n3-extras-13.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_ns_dot_end() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-ns-dot-end.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bad_ns_dot_start() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-ns-dot-start.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_num_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-num-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_num_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-num-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_num_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-num-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_num_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-num-04.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_num_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-num-05.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_number_dot_in_anon() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-number-dot-in-anon.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bad_pname_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-pname-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_pname_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-pname-02.ttl"), false);
  }
//  @Test
//  public void test_turtle_syntax_bad_pname_03() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-pname-03.ttl"), false);
//  }
  @Test
  public void test_turtle_syntax_bad_prefix_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-prefix-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_prefix_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-prefix-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_prefix_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-prefix-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_prefix_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-prefix-04.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_prefix_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-prefix-05.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_string_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-string-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_string_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-string-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_string_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-string-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_string_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-string-04.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_string_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-string-05.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_string_06() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-string-06.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_string_07() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-string-07.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-04.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-05.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_06() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-06.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_07() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-07.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bad_struct_08() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-08.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_09() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-09.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_10() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-10.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_11() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-11.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_12() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-12.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_13() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-13.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_14() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-14.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_15() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-15.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_16() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-16.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_struct_17() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-struct-17.ttl"), true);
  }
//  @Test
//  public void test_turtle_syntax_bad_uri_01() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-uri-01.ttl"), false);
//  }
  @Test
  public void test_turtle_syntax_bad_uri_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-uri-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_bad_uri_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-uri-03.ttl"), false);
  }
//  @Test
//  public void test_turtle_syntax_bad_uri_04() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-uri-04.ttl"), false);
//  }
//  @Test
//  public void test_turtle_syntax_bad_uri_05() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bad-uri-05.ttl"), false);
//  }
  @Test
  public void test_turtle_syntax_base_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-base-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_base_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-base-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_base_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-base-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_base_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-base-04.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_blank_label() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-blank-label.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-04.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-05.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_06() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-06.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_07() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-07.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_08() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-08.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_09() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-09.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_bnode_10() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-bnode-10.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_datatypes_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-datatypes-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_datatypes_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-datatypes-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_file_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-file-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_file_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-file-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_file_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-file-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_kw_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-kw-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_kw_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-kw-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_kw_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-kw-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_lists_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-lists-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_lists_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-lists-02.ttl"), true);
  }
//  @Test
//  public void test_turtle_syntax_lists_03() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-lists-03.ttl"), true);
//  }
//  @Test
//  public void test_turtle_syntax_lists_04() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-lists-04.ttl"), true);
//  }
//  @Test
//  public void test_turtle_syntax_lists_05() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-lists-05.ttl"), true);
//  }
//  @Test
//  public void test_turtle_syntax_ln_colons() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-ln-colons.ttl"), true);
//  }
  @Test
  public void test_turtle_syntax_ln_dots() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-ln-dots.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_ns_dots() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-ns-dots.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_number_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_number_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_number_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_number_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-04.ttl"), true);
  }
//  @Test
//  public void test_turtle_syntax_number_05() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-05.ttl"), true);
//  }
  @Test
  public void test_turtle_syntax_number_06() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-06.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_number_07() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-07.ttl"), true);
  }
//  @Test
//  public void test_turtle_syntax_number_08() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-08.ttl"), true);
//  }
  @Test
  public void test_turtle_syntax_number_09() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-09.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_number_10() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-10.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_number_11() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-number-11.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_pname_esc_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-pname-esc-01.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_pname_esc_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-pname-esc-02.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_pname_esc_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-pname-esc-03.ttl"), false);
  }
  @Test
  public void test_turtle_syntax_prefix_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-01.ttl"), true);
  }
//  @Test
//  public void test_turtle_syntax_prefix_02() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-02.ttl"), true);
//  }
  @Test
  public void test_turtle_syntax_prefix_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_prefix_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-04.ttl"), true);
  }
//  @Test
//  public void test_turtle_syntax_prefix_05() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-05.ttl"), true);
//  }
//  @Test
//  public void test_turtle_syntax_prefix_06() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-06.ttl"), true);
//  }
  @Test
  public void test_turtle_syntax_prefix_07() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-07.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_prefix_08() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-08.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_prefix_09() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-prefix-09.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_str_esc_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-str-esc-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_str_esc_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-str-esc-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_str_esc_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-str-esc-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-04.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-05.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_06() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-06.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_07() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-07.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_08() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-08.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_09() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-09.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_10() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-10.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_string_11() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-string-11.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_struct_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-struct-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_struct_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-struct-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_struct_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-struct-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_struct_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-struct-04.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_struct_05() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-struct-05.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_uri_01() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-uri-01.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_uri_02() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-uri-02.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_uri_03() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-uri-03.ttl"), true);
  }
  @Test
  public void test_turtle_syntax_uri_04() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "turtle-syntax-uri-04.ttl"), true);
  }
  @Test
  public void test_two_LITERAL_LONG2sNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "two_LITERAL_LONG2s.nt"), true);
  }
  @Test
  public void test_two_LITERAL_LONG2s() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "two_LITERAL_LONG2s.ttl"), true);
  }
  @Test
  public void test_underscore_in_localNameNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "underscore_in_localName.nt"), true);
  }
  @Test
  public void test_underscore_in_localName() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "underscore_in_localName.ttl"), true);
  }
  @Test
  public void test_anonymous_blank_node_object() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "anonymous_blank_node_object.ttl"), true);
  }
  @Test
  public void test_anonymous_blank_node_subject() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "anonymous_blank_node_subject.ttl"), true);
  }
  @Test
  public void test_bareword_a_predicateNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "bareword_a_predicate.nt"), true);
  }
  @Test
  public void test_bareword_a_predicate() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "bareword_a_predicate.ttl"), true);
  }
  @Test
  public void test_bareword_decimalNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "bareword_decimal.nt"), true);
  }
  @Test
  public void test_bareword_decimal() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "bareword_decimal.ttl"), true);
  }
  @Test
  public void test_bareword_doubleNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "bareword_double.nt"), true);
  }
  @Test
  public void test_bareword_double() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "bareword_double.ttl"), true);
  }
  @Test
  public void test_bareword_integer() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "bareword_integer.ttl"), true);
  }
  @Test
  public void test_blankNodePropertyList_as_objectNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "blankNodePropertyList_as_object.nt"), true);
  }
  @Test
  public void test_blankNodePropertyList_as_object() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "blankNodePropertyList_as_object.ttl"), true);
  }
  @Test
  public void test_blankNodePropertyList_as_subjectNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "blankNodePropertyList_as_subject.nt"), true);
  }
//  @Test
//  public void test_blankNodePropertyList_as_subject() throws Exception {
//    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "blankNodePropertyList_as_subject.ttl"), true);
//  }

  @Test
  public void test_blankNodePropertyList_containing_collectionNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "blankNodePropertyList_containing_collection.nt"), true);
  }
  @Test
  public void test_blankNodePropertyList_containing_collection() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "blankNodePropertyList_containing_collection.ttl"), true);
  }
  @Test
  public void test_blankNodePropertyList_with_multiple_triplesNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "blankNodePropertyList_with_multiple_triples.nt"), true);
  }
  @Test
  public void test_blankNodePropertyList_with_multiple_triples() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "blankNodePropertyList_with_multiple_triples.ttl"), true);
  }
  @Test
  public void test_collection_objectNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "collection_object.nt"), true);
  }
  @Test
  public void test_collection_object() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "collection_object.ttl"), true);
  }
  @Test
  public void test_collection_subjectNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "collection_subject.nt"), true);
  }
  @Test
  public void test_collection_subject() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "collection_subject.ttl"), false);
  }
  @Test
  public void test_comment_following_localName() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "comment_following_localName.ttl"), true);
  }
  @Test
  public void test_comment_following_PNAME_NSNT() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "comment_following_PNAME_NS.nt"), true);
  }
  @Test
  public void test_comment_following_PNAME_NS() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "comment_following_PNAME_NS.ttl"), false);
  }
  @Test
  public void test__default_namespace_IRI() throws Exception {
    doTest(Utilities.path(TestingUtilities.home(), "tests", "turtle", "default_namespace_IRI.ttl"), true);
  }
//

  @Test
  public void test_audit_event_example_pixQuery() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("audit-event-example-pixQuery.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "audit-event-example-pixQuery.ttl")));
  }
  @Test
  public void test_audit_event_example_media() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("audit-event-example-media.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "audit-event-example-media.ttl")));
  }
  @Test
  public void test_audit_event_example_logout() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("audit-event-example-logout.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "audit-event-example-logout.ttl")));
  }
  @Test
  public void test_audit_event_example_login() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("audit-event-example-login.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "audit-event-example-login.ttl")));
  }
  @Test
  public void test_appointmentresponse_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("appointmentresponse-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "appointmentresponse-example.ttl")));
  }
  @Test
  public void test_appointmentresponse_example_req() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("appointmentresponse-example-req.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "appointmentresponse-example-req.ttl")));
  }
  @Test
  public void test_appointment_example2doctors() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("appointment-example2doctors.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "appointment-example2doctors.ttl")));
  }
  @Test
  public void test_appointment_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("appointment-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "appointment-example.ttl")));
  }
  @Test
  public void test_appointment_example_request() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("appointment-example-request.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "appointment-example-request.ttl")));
  }
  @Test
  public void test_allergyintolerance_medication() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("allergyintolerance-medication.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "allergyintolerance-medication.ttl")));
  }
  @Test
  public void test_allergyintolerance_fishallergy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("allergyintolerance-fishallergy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "allergyintolerance-fishallergy.ttl")));
  }
  @Test
  public void test_allergyintolerance_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("allergyintolerance-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "allergyintolerance-example.ttl")));
  }
  @Test
  public void test_account_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("account-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "account-example.ttl")));
  }
  @Test
  public void test_xds_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("xds-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "xds-example.ttl")));
  }
  @Test
  public void test_visionprescription_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("visionprescription-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "visionprescription-example.ttl")));
  }
  @Test
  public void test_visionprescription_example_1() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("visionprescription-example-1.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "visionprescription-example-1.ttl")));
  }
  @Test
  public void test_valueset_ucum_common() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("valueset-ucum-common.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "valueset-ucum-common.ttl")));
  }
  @Test
  public void test_valueset_nhin_purposeofuse() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("valueset-nhin-purposeofuse.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "valueset-nhin-purposeofuse.ttl")));
  }
  @Test
  public void test_valueset_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("valueset-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "valueset-example.ttl")));
  }
  @Test
  public void test_valueset_example_yesnodontknow() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("valueset-example-yesnodontknow.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "valueset-example-yesnodontknow.ttl")));
  }
  @Test
  public void test_valueset_example_intensional() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("valueset-example-intensional.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "valueset-example-intensional.ttl")));
  }
  @Test
  public void test_valueset_example_expansion() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("valueset-example-expansion.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "valueset-example-expansion.ttl")));
  }
  @Test
  public void test_valueset_cpt_all() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("valueset-cpt-all.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "valueset-cpt-all.ttl")));
  }
  @Test
  public void test_testscript_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("testscript-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "testscript-example.ttl")));
  }
  @Test
  public void test_testscript_example_rule() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("testscript-example-rule.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "testscript-example-rule.ttl")));
  }
  @Test
  public void test_supplydelivery_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("supplydelivery-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "supplydelivery-example.ttl")));
  }
  @Test
  public void test_substance_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("substance-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "substance-example.ttl")));
  }
  @Test
  public void test_substance_example_silver_nitrate_product() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("substance-example-silver-nitrate-product.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "substance-example-silver-nitrate-product.ttl")));
  }
  @Test
  public void test_substance_example_f203_potassium() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("substance-example-f203-potassium.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "substance-example-f203-potassium.ttl")));
  }
  @Test
  public void test_substance_example_f202_staphylococcus() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("substance-example-f202-staphylococcus.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "substance-example-f202-staphylococcus.ttl")));
  }
  @Test
  public void test_substance_example_f201_dust() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("substance-example-f201-dust.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "substance-example-f201-dust.ttl")));
  }
  @Test
  public void test_substance_example_amoxicillin_clavulanate() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("substance-example-amoxicillin-clavulanate.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "substance-example-amoxicillin-clavulanate.ttl")));
  }
  @Test
  public void test_subscription_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("subscription-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "subscription-example.ttl")));
  }
  @Test
  public void test_subscription_example_error() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("subscription-example-error.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "subscription-example-error.ttl")));
  }
  @Test
  public void test_structuremap_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("structuremap-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "structuremap-example.ttl")));
  }
  @Test
  public void test_structuredefinition_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("structuredefinition-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "structuredefinition-example.ttl")));
  }
  @Test
  public void test_specimen_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("specimen-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "specimen-example.ttl")));
  }
  @Test
  public void test_specimen_example_urine() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("specimen-example-urine.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "specimen-example-urine.ttl")));
  }
  @Test
  public void test_specimen_example_isolate() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("specimen-example-isolate.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "specimen-example-isolate.ttl")));
  }
  @Test
  public void test_slot_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("slot-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "slot-example.ttl")));
  }
  @Test
  public void test_slot_example_unavailable() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("slot-example-unavailable.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "slot-example-unavailable.ttl")));
  }
  @Test
  public void test_slot_example_tentative() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("slot-example-tentative.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "slot-example-tentative.ttl")));
  }
  @Test
  public void test_slot_example_busy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("slot-example-busy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "slot-example-busy.ttl")));
  }
  @Test
  public void test_sequence_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("sequence-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "sequence-example.ttl")));
  }
  @Test
  public void test_searchparameter_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("searchparameter-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "searchparameter-example.ttl")));
  }
  @Test
  public void test_searchparameter_example_extension() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("searchparameter-example-extension.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "searchparameter-example-extension.ttl")));
  }
  @Test
  public void test_schedule_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("schedule-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "schedule-example.ttl")));
  }
  @Test
  public void test_riskassessment_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("riskassessment-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "riskassessment-example.ttl")));
  }
  @Test
  public void test_riskassessment_example_prognosis() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("riskassessment-example-prognosis.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "riskassessment-example-prognosis.ttl")));
  }
  @Test
  public void test_riskassessment_example_population() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("riskassessment-example-population.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "riskassessment-example-population.ttl")));
  }
  @Test
  public void test_riskassessment_example_cardiac() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("riskassessment-example-cardiac.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "riskassessment-example-cardiac.ttl")));
  }
  @Test
  public void test_relatedperson_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("relatedperson-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "relatedperson-example.ttl")));
  }
  @Test
  public void test_relatedperson_example_peter() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("relatedperson-example-peter.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "relatedperson-example-peter.ttl")));
  }
  @Test
  public void test_relatedperson_example_f002_ariadne() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("relatedperson-example-f002-ariadne.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "relatedperson-example-f002-ariadne.ttl")));
  }
  @Test
  public void test_relatedperson_example_f001_sarah() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("relatedperson-example-f001-sarah.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "relatedperson-example-f001-sarah.ttl")));
  }
  @Test
  public void test_provenance_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("provenance-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "provenance-example.ttl")));
  }
  @Test
  public void test_provenance_example_sig() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("provenance-example-sig.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "provenance-example-sig.ttl")));
  }
  @Test
  public void test_processresponse_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processresponse-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processresponse-example.ttl")));
  }
  @Test
  public void test_processrequest_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example.ttl")));
  }
  @Test
  public void test_processrequest_example_status() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example-status.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example-status.ttl")));
  }
  @Test
  public void test_processrequest_example_reverse() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example-reverse.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example-reverse.ttl")));
  }
  @Test
  public void test_processrequest_example_reprocess() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example-reprocess.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example-reprocess.ttl")));
  }
  @Test
  public void test_processrequest_example_poll_specific() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example-poll-specific.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example-poll-specific.ttl")));
  }
  @Test
  public void test_processrequest_example_poll_payrec() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example-poll-payrec.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example-poll-payrec.ttl")));
  }
  @Test
  public void test_processrequest_example_poll_inclusive() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example-poll-inclusive.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example-poll-inclusive.ttl")));
  }
  @Test
  public void test_processrequest_example_poll_exclusive() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example-poll-exclusive.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example-poll-exclusive.ttl")));
  }
  @Test
  public void test_processrequest_example_poll_eob() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("processrequest-example-poll-eob.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "processrequest-example-poll-eob.ttl")));
  }
  @Test
  public void test_procedurerequest_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("servicerequest-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "servicerequest-example.ttl")));
  }
  @Test
  public void test_procedure_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("procedure-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "procedure-example.ttl")));
  }
  @Test
  public void test_procedure_example_implant() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("procedure-example-implant.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "procedure-example-implant.ttl")));
  }
  @Test
  public void test_procedure_example_f201_tpf() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("procedure-example-f201-tpf.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "procedure-example-f201-tpf.ttl")));
  }
  @Test
  public void test_procedure_example_f004_tracheotomy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("procedure-example-f004-tracheotomy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "procedure-example-f004-tracheotomy.ttl")));
  }
  @Test
  public void test_procedure_example_f003_abscess() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("procedure-example-f003-abscess.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "procedure-example-f003-abscess.ttl")));
  }
  @Test
  public void test_procedure_example_f002_lung() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("procedure-example-f002-lung.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "procedure-example-f002-lung.ttl")));
  }
  @Test
  public void test_procedure_example_f001_heart() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("procedure-example-f001-heart.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "procedure-example-f001-heart.ttl")));
  }
  @Test
  public void test_procedure_example_biopsy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("procedure-example-biopsy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "procedure-example-biopsy.ttl")));
  }
  @Test
  public void test_practitionerrole_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitionerrole-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitionerrole-example.ttl")));
  }
  @Test
  public void test_practitioner_examples_general() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-examples-general.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-examples-general.ttl")));
  }
  @Test
  public void test_practitioner_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example.ttl")));
  }
  @Test
  public void test_practitioner_example_xcda1() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-xcda1.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-xcda1.ttl")));
  }
  @Test
  public void test_practitioner_example_xcda_author() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-xcda-author.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-xcda-author.ttl")));
  }
  @Test
  public void test_practitioner_example_f204_ce() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f204-ce.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f204-ce.ttl")));
  }
  @Test
  public void test_practitioner_example_f203_jvg() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f203-jvg.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f203-jvg.ttl")));
  }
  @Test
  public void test_practitioner_example_f202_lm() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f202-lm.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f202-lm.ttl")));
  }
  @Test
  public void test_practitioner_example_f201_ab() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f201-ab.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f201-ab.ttl")));
  }
  @Test
  public void test_practitioner_example_f007_sh() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f007-sh.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f007-sh.ttl")));
  }
  @Test
  public void test_practitioner_example_f006_rvdb() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f006-rvdb.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f006-rvdb.ttl")));
  }
  @Test
  public void test_practitioner_example_f005_al() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f005-al.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f005-al.ttl")));
  }
  @Test
  public void test_practitioner_example_f004_rb() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f004-rb.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f004-rb.ttl")));
  }
  @Test
  public void test_practitioner_example_f003_mv() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f003-mv.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f003-mv.ttl")));
  }
  @Test
  public void test_practitioner_example_f002_pv() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f002-pv.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f002-pv.ttl")));
  }
  @Test
  public void test_practitioner_example_f001_evdb() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("practitioner-example-f001-evdb.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "practitioner-example-f001-evdb.ttl")));
  }
  @Test
  public void test_person_provider_directory() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("person-provider-directory.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "person-provider-directory.ttl")));
  }
  @Test
  public void test_person_patient_portal() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("person-patient-portal.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "person-patient-portal.ttl")));
  }
  @Test
  public void test_person_grahame() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("person-grahame.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "person-grahame.ttl")));
  }
  @Test
  public void test_person_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("person-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "person-example.ttl")));
  }
  @Test
  public void test_person_example_f002_ariadne() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("person-example-f002-ariadne.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "person-example-f002-ariadne.ttl")));
  }
  @Test
  public void test_paymentreconciliation_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("paymentreconciliation-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "paymentreconciliation-example.ttl")));
  }
  @Test
  public void test_paymentnotice_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("paymentnotice-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "paymentnotice-example.ttl")));
  }
  @Test
  public void test_patient_glossy_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-glossy-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-glossy-example.ttl")));
  }
  @Test
  public void test_patient_examples_general() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-examples-general.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-examples-general.ttl")));
  }
  @Test
  public void test_patient_examples_cypress_template() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-examples-cypress-template.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-examples-cypress-template.ttl")));
  }
  @Test
  public void test_patient_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example.ttl")));
  }
  @Test
  public void test_patient_example_xds() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-xds.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-xds.ttl")));
  }
  @Test
  public void test_patient_example_xcda() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-xcda.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-xcda.ttl")));
  }
  @Test
  public void test_patient_example_proband() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-proband.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-proband.ttl")));
  }
  @Test
  public void test_patient_example_ihe_pcd() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-ihe-pcd.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-ihe-pcd.ttl")));
  }
  @Test
  public void test_patient_example_f201_roel() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-f201-roel.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-f201-roel.ttl")));
  }
  @Test
  public void test_patient_example_f001_pieter() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-f001-pieter.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-f001-pieter.ttl")));
  }
  @Test
  public void test_patient_example_dicom() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-dicom.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-dicom.ttl")));
  }
  @Test
  public void test_patient_example_d() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-d.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-d.ttl")));
  }
  @Test
  public void test_patient_example_c() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-c.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-c.ttl")));
  }
  @Test
  public void test_patient_example_b() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-b.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-b.ttl")));
  }
  @Test
  public void test_patient_example_animal() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-animal.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-animal.ttl")));
  }
  @Test
  public void test_patient_example_a() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("patient-example-a.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "patient-example-a.ttl")));
  }
  @Test
  public void test_parameters_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("parameters-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "parameters-example.ttl")));
  }
  @Test
  public void test_organization_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example.ttl")));
  }
  @Test
  public void test_organization_example_lab() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-lab.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-lab.ttl")));
  }
  @Test
  public void test_organization_example_insurer() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-insurer.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-insurer.ttl")));
  }
  @Test
  public void test_organization_example_good_health_care() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-good-health-care.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-good-health-care.ttl")));
  }
  @Test
  public void test_organization_example_gastro() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-gastro.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-gastro.ttl")));
  }
  @Test
  public void test_organization_example_f203_bumc() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-f203-bumc.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-f203-bumc.ttl")));
  }
  @Test
  public void test_organization_example_f201_aumc() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-f201-aumc.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-f201-aumc.ttl")));
  }
  @Test
  public void test_organization_example_f003_burgers_ENT() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-f003-burgers-ENT.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-f003-burgers-ENT.ttl")));
  }
  @Test
  public void test_organization_example_f002_burgers_card() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-f002-burgers-card.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-f002-burgers-card.ttl")));
  }
  @Test
  public void test_organization_example_f001_burgers() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("organization-example-f001-burgers.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "organization-example-f001-burgers.ttl")));
  }
  @Test
  public void test_operationoutcome_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("operationoutcome-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "operationoutcome-example.ttl")));
  }
  @Test
  public void test_operationoutcome_example_validationfail() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("operationoutcome-example-validationfail.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "operationoutcome-example-validationfail.ttl")));
  }
  @Test
  public void test_operationoutcome_example_searchfail() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("operationoutcome-example-searchfail.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "operationoutcome-example-searchfail.ttl")));
  }
  @Test
  public void test_operationoutcome_example_exception() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("operationoutcome-example-exception.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "operationoutcome-example-exception.ttl")));
  }
  @Test
  public void test_operationoutcome_example_break_the_glass() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("operationoutcome-example-break-the-glass.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "operationoutcome-example-break-the-glass.ttl")));
  }
  @Test
  public void test_operationoutcome_example_allok() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("operationoutcome-example-allok.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "operationoutcome-example-allok.ttl")));
  }
  @Test
  public void test_operationdefinition_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("operationdefinition-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "operationdefinition-example.ttl")));
  }
  @Test
  public void test_observation_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example.ttl")));
  }
  @Test
  public void test_observation_example_unsat() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-unsat.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-unsat.ttl")));
  }
  @Test
  public void test_observation_example_satO2() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-satO2.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-satO2.ttl")));
  }
  @Test
  public void test_observation_example_sample_data() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-sample-data.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-sample-data.ttl")));
  }
  @Test
  public void test_observation_example_glasgow() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-glasgow.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-glasgow.ttl")));
  }
  @Test
  public void test_observation_example_glasgow_qa() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-glasgow-qa.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-glasgow-qa.ttl")));
  }
  @Test
  public void test_observation_example_genetics_5() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-genetics-5.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-genetics-5.ttl")));
  }
  @Test
  public void test_observation_example_genetics_4() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-genetics-4.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-genetics-4.ttl")));
  }
  @Test
  public void test_observation_example_genetics_3() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-genetics-3.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-genetics-3.ttl")));
  }
  @Test
  public void test_observation_example_genetics_2() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-genetics-2.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-genetics-2.ttl")));
  }
  @Test
  public void test_observation_example_genetics_1() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-genetics-1.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-genetics-1.ttl")));
  }
  @Test
  public void test_observation_example_f206_staphylococcus() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f206-staphylococcus.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f206-staphylococcus.ttl")));
  }
  @Test
  public void test_observation_example_f205_egfr() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f205-egfr.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f205-egfr.ttl")));
  }
  @Test
  public void test_observation_example_f204_creatinine() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f204-creatinine.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f204-creatinine.ttl")));
  }
  @Test
  public void test_observation_example_f203_bicarbonate() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f203-bicarbonate.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f203-bicarbonate.ttl")));
  }
  @Test
  public void test_observation_example_f202_temperature() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f202-temperature.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f202-temperature.ttl")));
  }
  @Test
  public void test_observation_example_f005_hemoglobin() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f005-hemoglobin.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f005-hemoglobin.ttl")));
  }
  @Test
  public void test_observation_example_f004_erythrocyte() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f004-erythrocyte.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f004-erythrocyte.ttl")));
  }
  @Test
  public void test_observation_example_f003_co2() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f003-co2.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f003-co2.ttl")));
  }
  @Test
  public void test_observation_example_f002_excess() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f002-excess.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f002-excess.ttl")));
  }
  @Test
  public void test_observation_example_f001_glucose() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-f001-glucose.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-f001-glucose.ttl")));
  }
  @Test
  public void test_observation_example_bloodpressure() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-bloodpressure.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-bloodpressure.ttl")));
  }
  @Test
  public void test_observation_example_bloodpressure_cancel() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("observation-example-bloodpressure-cancel.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "observation-example-bloodpressure-cancel.ttl")));
  }
  @Test
  public void test_nutritionorder_example_texture_modified() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-texture-modified.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-texture-modified.ttl")));
  }
  @Test
  public void test_nutritionorder_example_renaldiet() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-renaldiet.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-renaldiet.ttl")));
  }
  @Test
  public void test_nutritionorder_example_pureeddiet() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-pureeddiet.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-pureeddiet.ttl")));
  }
  @Test
  public void test_nutritionorder_example_pureeddiet_simple() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-pureeddiet-simple.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-pureeddiet-simple.ttl")));
  }
  @Test
  public void test_nutritionorder_example_proteinsupplement() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-proteinsupplement.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-proteinsupplement.ttl")));
  }
  @Test
  public void test_nutritionorder_example_infantenteral() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-infantenteral.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-infantenteral.ttl")));
  }
  @Test
  public void test_nutritionorder_example_fiberrestricteddiet() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-fiberrestricteddiet.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-fiberrestricteddiet.ttl")));
  }
  @Test
  public void test_nutritionorder_example_enteralcontinuous() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-enteralcontinuous.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-enteralcontinuous.ttl")));
  }
  @Test
  public void test_nutritionorder_example_enteralbolus() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-enteralbolus.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-enteralbolus.ttl")));
  }
  @Test
  public void test_nutritionorder_example_energysupplement() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-energysupplement.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-energysupplement.ttl")));
  }
  @Test
  public void test_nutritionorder_example_diabeticsupplement() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-diabeticsupplement.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-diabeticsupplement.ttl")));
  }
  @Test
  public void test_nutritionorder_example_diabeticdiet() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-diabeticdiet.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-diabeticdiet.ttl")));
  }
  @Test
  public void test_nutritionorder_example_cardiacdiet() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("nutritionorder-example-cardiacdiet.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "nutritionorder-example-cardiacdiet.ttl")));
  }
  @Test
  public void test_namingsystem_registry() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("namingsystem-registry.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "namingsystem-registry.ttl")));
  }
  @Test
  public void test_namingsystem_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("namingsystem-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "namingsystem-example.ttl")));
  }
  @Test
  public void test_namingsystem_example_id() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("namingsystem-example-id.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "namingsystem-example-id.ttl")));
  }
  @Test
  public void test_messageheader_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("messageheader-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "messageheader-example.ttl")));
  }
  @Test
  public void test_message_response_link() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("message-response-link.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "message-response-link.ttl")));
  }
  @Test
  public void test_message_request_link() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("message-request-link.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "message-request-link.ttl")));
  }
  @Test
  public void test_medicationstatementexample7() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationstatementexample7.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationstatementexample7.ttl")));
  }
  @Test
  public void test_medicationstatementexample6() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationstatementexample6.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationstatementexample6.ttl")));
  }
  @Test
  public void test_medicationstatementexample5() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationstatementexample5.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationstatementexample5.ttl")));
  }
  @Test
  public void test_medicationstatementexample4() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationstatementexample4.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationstatementexample4.ttl")));
  }
  @Test
  public void test_medicationstatementexample2() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationstatementexample2.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationstatementexample2.ttl")));
  }
  @Test
  public void test_medicationstatementexample1() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationstatementexample1.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationstatementexample1.ttl")));
  }
  @Test
  public void test_medicationrequestexample2() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationrequestexample2.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationrequestexample2.ttl")));
  }
  @Test
  public void test_medicationrequestexample1() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationrequestexample1.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationrequestexample1.ttl")));
  }
  @Test
  public void test_medicationexample15() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationexample15.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationexample15.ttl")));
  }
  @Test
  public void test_medicationexample1() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationexample1.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationexample1.ttl")));
  }
  @Test
  public void test_medicationdispenseexample8() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationdispenseexample8.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationdispenseexample8.ttl")));
  }
  @Test
  public void test_medicationadministrationexample3() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationadministrationexample3.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationadministrationexample3.ttl")));
  }
  @Test
  public void test_medication_example_f203_paracetamol() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("medicationexample0312.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "medicationexample0312.ttl")));
  }
  @Test
  public void test_media_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("media-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "media-example.ttl")));
  }
  @Test
  public void test_media_example_sound() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("media-example-sound.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "media-example-sound.ttl")));
  }
  @Test
  public void test_media_example_dicom() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("media-example-dicom.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "media-example-dicom.ttl")));
  }
  @Test
  public void test_measurereport_cms146_cat3_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("measurereport-cms146-cat3-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "measurereport-cms146-cat3-example.ttl")));
  }
  @Test
  public void test_measurereport_cms146_cat2_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("measurereport-cms146-cat2-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "measurereport-cms146-cat2-example.ttl")));
  }
  @Test
  public void test_measurereport_cms146_cat1_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("measurereport-cms146-cat1-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "measurereport-cms146-cat1-example.ttl")));
  }
  @Test
  public void test_measure_exclusive_breastfeeding() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("measure-exclusive-breastfeeding.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "measure-exclusive-breastfeeding.ttl")));
  }
  @Test
  public void test_location_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("location-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "location-example.ttl")));
  }
  @Test
  public void test_location_example_ukpharmacy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("location-example-ukpharmacy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "location-example-ukpharmacy.ttl")));
  }
  @Test
  public void test_location_example_room() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("location-example-room.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "location-example-room.ttl")));
  }
  @Test
  public void test_location_example_patients_home() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("location-example-patients-home.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "location-example-patients-home.ttl")));
  }
  @Test
  public void test_location_example_hl7hq() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("location-example-hl7hq.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "location-example-hl7hq.ttl")));
  }
  @Test
  public void test_location_example_ambulance() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("location-example-ambulance.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "location-example-ambulance.ttl")));
  }
  @Test
  public void test_list_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("list-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "list-example.ttl")));
  }
  @Test
  public void test_list_example_medlist() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("list-example-medlist.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "list-example-medlist.ttl")));
  }
  @Test
  public void test_list_example_familyhistory_f201_roel() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("list-example-familyhistory-f201-roel.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "list-example-familyhistory-f201-roel.ttl")));
  }
  @Test
  public void test_list_example_empty() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("list-example-empty.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "list-example-empty.ttl")));
  }
  @Test
  public void test_list_example_allergies() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("list-example-allergies.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "list-example-allergies.ttl")));
  }
  @Test
  public void test_linkage_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("linkage-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "linkage-example.ttl")));
  }
  @Test
  public void test_library_exclusive_breastfeeding_cqm_logic() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("library-exclusive-breastfeeding-cqm-logic.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "library-exclusive-breastfeeding-cqm-logic.ttl")));
  }
  @Test
  public void test_library_exclusive_breastfeeding_cds_logic() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("library-exclusive-breastfeeding-cds-logic.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "library-exclusive-breastfeeding-cds-logic.ttl")));
  }
  @Test
  public void test_library_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("library-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "library-example.ttl")));
  }
  @Test
  public void test_library_cms146_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("library-cms146-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "library-cms146-example.ttl")));
  }
  @Test
  public void test_implementationguide_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("implementationguide-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "implementationguide-example.ttl")));
  }
  @Test
  public void test_immunizationrecommendation_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("immunizationrecommendation-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "immunizationrecommendation-example.ttl")));
  }
  @Test
  public void test_immunization_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("immunization-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "immunization-example.ttl")));
  }
  @Test
  public void test_immunization_example_refused() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("immunization-example-refused.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "immunization-example-refused.ttl")));
  }
  @Test
  public void test_imagingstudy_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("imagingstudy-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "imagingstudy-example.ttl")));
  }
  @Test
  public void test_healthcareservice_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("healthcareservice-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "healthcareservice-example.ttl")));
  }
  @Test
  public void test_guidanceresponse_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("guidanceresponse-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "guidanceresponse-example.ttl")));
  }
  @Test
  public void test_group_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("group-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "group-example.ttl")));
  }
  @Test
  public void test_group_example_member() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("group-example-member.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "group-example-member.ttl")));
  }
  @Test
  public void test_goal_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("goal-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "goal-example.ttl")));
  }
  @Test
  public void test_flag_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("flag-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "flag-example.ttl")));
  }
  @Test
  public void test_flag_example_encounter() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("flag-example-encounter.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "flag-example-encounter.ttl")));
  }
  @Test
  public void test_familymemberhistory_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("familymemberhistory-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "familymemberhistory-example.ttl")));
  }
  @Test
  public void test_familymemberhistory_example_mother() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("familymemberhistory-example-mother.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "familymemberhistory-example-mother.ttl")));
  }
  @Test
  public void test_explanationofbenefit_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("explanationofbenefit-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "explanationofbenefit-example.ttl")));
  }
  @Test
  public void test_episodeofcare_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("episodeofcare-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "episodeofcare-example.ttl")));
  }
  @Test
  public void test_enrollmentresponse_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("enrollmentresponse-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "enrollmentresponse-example.ttl")));
  }
  @Test
  public void test_enrollmentrequest_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("enrollmentrequest-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "enrollmentrequest-example.ttl")));
  }
  @Test
  public void test_endpoint_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("endpoint-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "endpoint-example.ttl")));
  }
  @Test
  public void test_encounter_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example.ttl")));
  }
  @Test
  public void test_encounter_example_xcda() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example-xcda.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example-xcda.ttl")));
  }
  @Test
  public void test_encounter_example_home() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example-home.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example-home.ttl")));
  }
  @Test
  public void test_encounter_example_f203_20130311() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example-f203-20130311.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example-f203-20130311.ttl")));
  }
  @Test
  public void test_encounter_example_f202_20130128() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example-f202-20130128.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example-f202-20130128.ttl")));
  }
  @Test
  public void test_encounter_example_f201_20130404() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example-f201-20130404.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example-f201-20130404.ttl")));
  }
  @Test
  public void test_encounter_example_f003_abscess() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example-f003-abscess.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example-f003-abscess.ttl")));
  }
  @Test
  public void test_encounter_example_f002_lung() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example-f002-lung.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example-f002-lung.ttl")));
  }
  @Test
  public void test_encounter_example_f001_heart() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("encounter-example-f001-heart.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "encounter-example-f001-heart.ttl")));
  }
  @Test
  public void test_eligibilityresponse_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("eligibilityresponse-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "eligibilityresponse-example.ttl")));
  }
  @Test
  public void test_eligibilityrequest_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("eligibilityrequest-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "eligibilityrequest-example.ttl")));
  }
  @Test
  public void test_documentreference_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("documentreference-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "documentreference-example.ttl")));
  }
  @Test
  public void test_documentmanifest_fm_attachment() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("documentmanifest-fm-attachment.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "documentmanifest-fm-attachment.ttl")));
  }
  @Test
  public void test_document_example_dischargesummary() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("document-example-dischargesummary.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "document-example-dischargesummary.ttl")));
  }
  @Test
  public void test_diagnosticreport_micro1() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-micro1.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-micro1.ttl")));
  }
  @Test
  public void test_diagnosticreport_hla_genetics_results_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-hla-genetics-results-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-hla-genetics-results-example.ttl")));
  }

  @Test
  public void test_diagnosticreport_genetics_comprehensive_bone_marrow_report() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-genetics-comprehensive-bone-marrow-report.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-genetics-comprehensive-bone-marrow-report.ttl")));
  }
  @Test
  public void test_diagnosticreport_examples_general() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-examples-general.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-examples-general.ttl")));
  }
  @Test
  public void test_diagnosticreport_example_ultrasound() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-example-ultrasound.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-example-ultrasound.ttl")));
  }
  @Test
  public void test_diagnosticreport_example_lipids() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-example-lipids.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-example-lipids.ttl")));
  }
  @Test
  public void test_diagnosticreport_example_ghp() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-example-ghp.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-example-ghp.ttl")));
  }
  @Test
  public void test_diagnosticreport_example_f202_bloodculture() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-example-f202-bloodculture.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-example-f202-bloodculture.ttl")));
  }
  @Test
  public void test_diagnosticreport_example_f201_brainct() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-example-f201-brainct.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-example-f201-brainct.ttl")));
  }
  @Test
  public void test_diagnosticreport_example_f001_bloodexam() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-example-f001-bloodexam.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-example-f001-bloodexam.ttl")));
  }
  @Test
  public void test_diagnosticreport_example_dxa() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("diagnosticreport-example-dxa.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "diagnosticreport-example-dxa.ttl")));
  }
  @Test
  public void test_deviceusestatement_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("deviceusestatement-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "deviceusestatement-example.ttl")));
  }
  @Test
  public void test_devicemetric_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("devicemetric-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "devicemetric-example.ttl")));
  }
  @Test
  public void test_devicecomponent_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("devicecomponent-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "devicecomponent-example.ttl")));
  }
  @Test
  public void test_devicecomponent_example_prodspec() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("devicecomponent-example-prodspec.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "devicecomponent-example-prodspec.ttl")));
  }
  @Test
  public void test_device_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("device-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "device-example.ttl")));
  }
  @Test
  public void test_device_example_udi1() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("device-example-udi1.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "device-example-udi1.ttl")));
  }
  @Test
  public void test_device_example_software() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("device-example-software.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "device-example-software.ttl")));
  }
  @Test
  public void test_device_example_pacemaker() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("device-example-pacemaker.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "device-example-pacemaker.ttl")));
  }
  @Test
  public void test_device_example_ihe_pcd() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("device-example-ihe-pcd.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "device-example-ihe-pcd.ttl")));
  }
  @Test
  public void test_device_example_f001_feedingtube() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("device-example-f001-feedingtube.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "device-example-f001-feedingtube.ttl")));
  }
  @Test
  public void test_detectedissue_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("detectedissue-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "detectedissue-example.ttl")));
  }
  @Test
  public void test_detectedissue_example_lab() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("detectedissue-example-lab.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "detectedissue-example-lab.ttl")));
  }
  @Test
  public void test_detectedissue_example_dup() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("detectedissue-example-dup.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "detectedissue-example-dup.ttl")));
  }
  @Test
  public void test_detectedissue_example_allergy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("detectedissue-example-allergy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "detectedissue-example-allergy.ttl")));
  }
  @Test
  public void test_coverage_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("coverage-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "coverage-example.ttl")));
  }
  @Test
  public void test_coverage_example_2() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("coverage-example-2.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "coverage-example-2.ttl")));
  }
  @Test
  public void test_contract_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("contract-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "contract-example.ttl")));
  }
  @Test
  public void test_condition_example2() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example2.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example2.ttl")));
  }
  @Test
  public void test_condition_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example.ttl")));
  }
  @Test
  public void test_condition_example_stroke() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-stroke.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-stroke.ttl")));
  }
  @Test
  public void test_condition_example_f205_infection() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-f205-infection.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-f205-infection.ttl")));
  }
  @Test
  public void test_condition_example_f204_renal() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-f204-renal.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-f204-renal.ttl")));
  }
  @Test
  public void test_condition_example_f203_sepsis() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-f203-sepsis.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-f203-sepsis.ttl")));
  }
  @Test
  public void test_condition_example_f202_malignancy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-f202-malignancy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-f202-malignancy.ttl")));
  }
  @Test
  public void test_condition_example_f201_fever() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-f201-fever.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-f201-fever.ttl")));
  }
  @Test
  public void test_condition_example_f003_abscess() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-f003-abscess.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-f003-abscess.ttl")));
  }
  @Test
  public void test_condition_example_f002_lung() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-f002-lung.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-f002-lung.ttl")));
  }
  @Test
  public void test_condition_example_f001_heart() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("condition-example-f001-heart.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "condition-example-f001-heart.ttl")));
  }
  @Test
  public void test_conceptmap_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("conceptmap-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "conceptmap-example.ttl")));
  }
  @Test
  public void test_conceptmap_example_specimen_type() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("conceptmap-example-specimen-type.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "conceptmap-example-specimen-type.ttl")));
  }
  @Test
  public void test_conceptmap_103() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("conceptmap-103.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "conceptmap-103.ttl")));
  }
  @Test
  public void test_composition_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("composition-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "composition-example.ttl")));
  }
  @Test
  public void test_communicationrequest_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("communicationrequest-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "communicationrequest-example.ttl")));
  }
  @Test
  public void test_communication_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("communication-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "communication-example.ttl")));
  }
  @Test
  public void test_codesystem_nhin_purposeofuse() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("codesystem-nhin-purposeofuse.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "codesystem-nhin-purposeofuse.ttl")));
  }
  @Test
  public void test_codesystem_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("codesystem-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "codesystem-example.ttl")));
  }
  @Test
  public void test_clinicalimpression_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("clinicalimpression-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "clinicalimpression-example.ttl")));
  }
  @Test
  public void test_claimresponse_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claimresponse-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claimresponse-example.ttl")));
  }
  @Test
  public void test_claim_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example.ttl")));
  }
  @Test
  public void test_claim_example_vision() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-vision.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-vision.ttl")));
  }
  @Test
  public void test_claim_example_vision_glasses() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-vision-glasses.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-vision-glasses.ttl")));
  }
  @Test
  public void test_claim_example_professional() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-professional.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-professional.ttl")));
  }
  @Test
  public void test_claim_example_pharmacy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-pharmacy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-pharmacy.ttl")));
  }
  @Test
  public void test_claim_example_oral_orthoplan() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-oral-orthoplan.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-oral-orthoplan.ttl")));
  }
  @Test
  public void test_claim_example_oral_identifier() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-oral-identifier.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-oral-identifier.ttl")));
  }
  @Test
  public void test_claim_example_oral_contained() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-oral-contained.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-oral-contained.ttl")));
  }
  @Test
  public void test_claim_example_oral_contained_identifier() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-oral-contained-identifier.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-oral-contained-identifier.ttl")));
  }
  @Test
  public void test_claim_example_oral_average() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-oral-average.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-oral-average.ttl")));
  }
  @Test
  public void test_claim_example_institutional() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("claim-example-institutional.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "claim-example-institutional.ttl")));
  }
  @Test
  public void test_careteam_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careteam-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careteam-example.ttl")));
  }
  @Test
  public void test_careplan_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example.ttl")));
  }
  @Test
  public void test_careplan_example_pregnancy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-pregnancy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-pregnancy.ttl")));
  }
  @Test
  public void test_careplan_example_integrated() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-integrated.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-integrated.ttl")));
  }
  @Test
  public void test_careplan_example_GPVisit() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-GPVisit.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-GPVisit.ttl")));
  }
  @Test
  public void test_careplan_example_f203_sepsis() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-f203-sepsis.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-f203-sepsis.ttl")));
  }
  @Test
  public void test_careplan_example_f202_malignancy() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-f202-malignancy.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-f202-malignancy.ttl")));
  }
  @Test
  public void test_careplan_example_f201_renal() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-f201-renal.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-f201-renal.ttl")));
  }
  @Test
  public void test_careplan_example_f003_pharynx() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-f003-pharynx.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-f003-pharynx.ttl")));
  }
  @Test
  public void test_careplan_example_f002_lung() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-f002-lung.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-f002-lung.ttl")));
  }
  @Test
  public void test_careplan_example_f001_heart() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("careplan-example-f001-heart.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "careplan-example-f001-heart.ttl")));
  }
  @Test
  public void test_bundle_transaction() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("bundle-transaction.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "bundle-transaction.ttl")));
  }
  @Test
  public void test_bundle_response() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("bundle-response.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "bundle-response.ttl")));
  }
  @Test
  public void test_bundle_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("bundle-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "bundle-example.ttl")));
  }
  @Test
  public void test_binary_f006() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("binary-f006.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "binary-f006.ttl")));
  }
  @Test
  public void test_binary_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("binary-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "binary-example.ttl")));
  }
  @Test
  public void test_basic_example2() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("basic-example2.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "basic-example2.ttl")));
  }
  @Test
  public void test_basic_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("basic-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "basic-example.ttl")));
  }
  @Test
  public void test_basic_example_narrative() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("basic-example-narrative.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "basic-example-narrative.ttl")));
  }
  @Test
  public void test_auditevent_example() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("auditevent-example.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "auditevent-example.ttl")));
  }
  @Test
  public void test_auditevent_example_disclosure() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("auditevent-example-disclosure.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "auditevent-example-disclosure.ttl")));
  }
  @Test
  public void test_audit_event_example_vread() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("audit-event-example-vread.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "audit-event-example-vread.ttl")));
  }
  @Test
  public void test_audit_event_example_search() throws FileNotFoundException, IOException, Exception {
    if (!TestingUtilities.silent)
      System.out.println("audit-event-example-search.ttl");
    new Turtle().parse(TextFile.fileToString(Utilities.path(TestingUtilities.content(), "audit-event-example-search.ttl")));
  }


}