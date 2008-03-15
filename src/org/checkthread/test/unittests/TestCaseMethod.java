/*
Copyright (c) 2008 Joe Conti

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
*/

package org.checkthread.test.unittests;

import java.util.*;

import junit.framework.TestCase;
import org.checkthread.parser.*;
import org.checkthread.test.target.basic.*;

public final class TestCaseMethod extends TestCase  {
    
    protected void setUp() {}
    protected void tearDown() {}
    
    public void testClassBasic() {
        TestParseHandler handler = TestUtil.parseClassHelper(TestBasicMethod.class);
        HashMap<String,InvokeMethodDataBean> hashMap = handler.getMethodData();
        
        // Verify target class has two methods
        int actualValue = hashMap.size();
        int expectedValue = 1;
        assertEquals(expectedValue,actualValue);
    }
       
    public void xxxtestClassBasic2() {
        TestParseHandler handler = TestUtil.parseClassHelper(TestBasicMethod2.class);
        HashMap<String,InvokeMethodDataBean> hashMap = handler.getMethodData();
        
        // Verify target class has two methods
        int actualValue = hashMap.size();
        int expectedValue = 1;
        assertEquals(expectedValue,actualValue);
    }
        
    public void xxxtestClassBasic3() {
        TestParseHandler handler = TestUtil.parseClassHelper(TestBasicMethod3.class);
        HashMap<String,InvokeMethodDataBean> hashMap = handler.getMethodData();
        
        // Verify target class has two methods
        int actualValue = hashMap.size();
        int expectedValue = 3;
        assertEquals(actualValue,expectedValue);
        
        // Verify method names
        assertEquals(true,hashMap.get("random")!=null);   
        assertEquals(true,hashMap.get("abs")!=null); 
    }

}
