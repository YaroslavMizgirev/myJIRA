package com.mymsoft.myJIRA.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IssueTypeTest {

    @Test
    void testDefaultConstructor() {
        IssueType issueType = new IssueType();
        assertNotNull(issueType, "IssueType should not be null");
        assertNull(issueType.getId(), "IssueType id should be null");
        assertNull(issueType.getName(), "IssueType name should be null");
        assertNull(issueType.getIconUrl(), "IssueType iconUrl should be null");
        assertNull(issueType.getColorHexCode(), "IssueType colorHexCode should be null");
    }

    @Test
    void testConstructorWithParameters() {
        IssueType issueType = new IssueType(1L, "Bug", "https://www.google.com", "#FF0000");
        assertNotNull(issueType, "IssueType should not be null");
        assertEquals(1L, issueType.getId(), "IssueType id should be 1");
        assertEquals("Bug", issueType.getName(), "IssueType name should be Bug");
        assertEquals("https://www.google.com", issueType.getIconUrl(), "IssueType iconUrl should be https://www.google.com");
        assertEquals("#FF0000", issueType.getColorHexCode(), "IssueType colorHexCode should be #FF0000");
    }

    @Test
    void testGettersAndSetters() {
        IssueType issueType = new IssueType();
        issueType.setId(1L);
        issueType.setName("Bug");
        issueType.setIconUrl("https://www.google.com");
        issueType.setColorHexCode("#FF0000");
        assertEquals(1L, issueType.getId(), "IssueType id should be 1");
        assertEquals("Bug", issueType.getName(), "IssueType name should be Bug");
        assertEquals("https://www.google.com", issueType.getIconUrl(), "IssueType iconUrl should be https://www.google.com");
        assertEquals("#FF0000", issueType.getColorHexCode(), "IssueType colorHexCode should be #FF0000");
    }

    @Test
    void testEqualsAndHashCode() {
        IssueType issueType1 = new IssueType(1L, "Bug", "https://www.google.com", "#FF0000");
        IssueType issueType2 = new IssueType(1L, "Bug", "https://www.google.com", "#FF0000");
        IssueType issueType3 = new IssueType();
        IssueType issueType4 = new IssueType();
        IssueType issueType5 = new IssueType(2L, "Task", "https://www.google.com", "#FF0000");
        IssueType issueType6 = new IssueType(1L, "Task", "https://www.google.com", "#00FF00");
        IssueType issueType7 = new IssueType(1L, "Bug", "https://www.yahoo.com", "#FF0000");
        IssueType issueType8 = new IssueType(1L, "Bug", "https://www.google.com", "#00FF00");

        assertEquals(issueType1, issueType2, "IssueType objects should be equal");
        assertEquals(issueType1.hashCode(), issueType2.hashCode(), "IssueType objects hash codes should be equal");
        assertNotEquals(issueType1, issueType3, "IssueType objects should not be equal");
        assertNotEquals(issueType1.hashCode(), issueType3.hashCode(), "IssueType objects hash codes should not be equal");
        assertEquals(issueType3, issueType4, "IssueType objects should be equal");
        assertEquals(issueType3.hashCode(), issueType4.hashCode(), "IssueType objects hash codes should be equal");
        assertNotEquals(issueType1, issueType5, "IssueType objects should not be equal");
        assertNotEquals(issueType1.hashCode(), issueType5.hashCode(), "IssueType objects hash codes should not be equal");
        assertNotEquals(issueType1, issueType6, "IssueType objects should not be equal");
        assertNotEquals(issueType1.hashCode(), issueType6.hashCode(), "IssueType objects hash codes should not be equal");
        assertEquals(issueType1, issueType7, "IssueType objects should be equal");
        assertEquals(issueType1.hashCode(), issueType7.hashCode(), "IssueType objects hash codes should be equal");
        assertEquals(issueType1, issueType8, "IssueType objects should be equal");
        assertEquals(issueType1.hashCode(), issueType8.hashCode(), "IssueType objects hash codes should be equal");
    }

    @Test
    void testEqualsSymmetry() {
        IssueType issueType1 = new IssueType(1L, "Bug", "https://www.google.com", "#FF0000");
        IssueType issueType2 = new IssueType(1L, "Bug", "https://www.google.com", "#FF0000");
        assertEquals(issueType1, issueType2, "IssueType objects should be equal");
        assertEquals(issueType1.hashCode(), issueType2.hashCode(), "IssueType objects hash codes should be equal");
        assertEquals(issueType2, issueType1, "IssueType objects should be equal");
        assertEquals(issueType2.hashCode(), issueType1.hashCode(), "IssueType objects hash codes should be equal");
    }

    @Test
    void testEqualsTransitive() {
        IssueType issueType1 = new IssueType(1L, "Bug", "https://www.google.com", "#FF0000");
        IssueType issueType2 = new IssueType(1L, "Bug", "https://www.google.com", "#FF0000");
        IssueType issueType3 = new IssueType(1L, "Bug", "https://www.google.com", "#FF0000");
        assertEquals(issueType1, issueType2, "IssueType objects should be equal");
        assertEquals(issueType1.hashCode(), issueType2.hashCode(), "IssueType objects hash codes should be equal");
        assertEquals(issueType2, issueType3, "IssueType objects should be equal");
        assertEquals(issueType2.hashCode(), issueType3.hashCode(), "IssueType objects hash codes should be equal");
        assertEquals(issueType1, issueType3, "IssueType objects should be equal");
        assertEquals(issueType1.hashCode(), issueType3.hashCode(), "IssueType objects hash codes should be equal");
        assertEquals(issueType1, issueType2, "IssueType objects should be equal");
        assertEquals(issueType1.hashCode(), issueType2.hashCode(), "IssueType objects hash codes should be equal");
    }
}