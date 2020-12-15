import com.forthreal.application.classes.ReverseLListCalc
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class testCases {
    @Test
    fun testCase()
    {
        val intVal = ReverseLListCalc.doCalc( listOf( 3, 2, 1 ) )

        assertTrue( intVal.isPresent )
        assertEquals( intVal.get(), 123)
    }

}