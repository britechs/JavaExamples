# PubSubStreamJSE11
A Java SE 11 example of using the [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html) API, and [Flow.Publisher](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Publisher.html) and [Flow.Subscriber](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Subscriber.html) APIs, which replace the [Oberservable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Observable.html) and [Observer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Observer.html) APIs. No third party libraries required, like RxJava.

The example starts a ServerSocket on port 9080, registers the Subscribers and then waits for HTTP Requests.  The HTTP Request headers are gathered and then sent to the Publisher where the Stream API is used to filter out the "User-Agent" header.  That line is then further processed and the "User-Agent: " is removed from the beginning of the line.  The remaining header information is sent to the Subscribers.  The first Subscriber just counts the number of "User-Agent" requests have come through and prints the information to System.out.  The second Subscriber just prints out a random saying from the arcade game [Sinistar](https://www.arcade-museum.com/game_detail.php?game_id=9553). 

This example shows that third party Streaming APIs may not be needed, and the Publisher/Subscriber Flow APIs that are more flexible than the Oberverable/Observer APIs.  This can be used in a reactive application without the need for any third party libraries.