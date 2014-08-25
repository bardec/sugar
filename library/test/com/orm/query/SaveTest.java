package com.orm.query;

import org.junit.Ignore;
import org.junit.Test;

import static com.orm.query.Condition.prop;
import static junit.framework.Assert.assertEquals;

public class SaveTest {

  @Test
  public void testSaveAfterDelete(){
    assertEquals(0, TestRecord.count(TestRecord.class, "", new String[]{});
    TestRecord testRecord = new TestRecord();
    testRecord.save();
    assertEquals(1, TestRecord.count(TestRecord.class, "", new String[]{});
    testRecord.delete();
    assertEquals(0, TestRecord.count(TestRecord.class, "", new String[]{});
    testRecord.save();
    assertEquals(1, TestRecord.count(TestRecord.class, "", new String[]{});
  }
}
