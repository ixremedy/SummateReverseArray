package com.forthreal.application.classes

import java.util.*
import java.util.stream.Collectors
import javax.xml.ws.Holder

object ReverseLListCalc
{
    public fun doCalc( reversedList: List<Int>) : Optional<Int>
    {
        try
        {   val sum =
                reversedList.
                    reversed().
                    stream().
                    reduce( 0, { a, b -> a*10 + b } )

            System.out.println("returning ${sum}")

            return Optional.of( sum )
        }
        catch(exc: Exception) { }

        return Optional.empty()
    }
}