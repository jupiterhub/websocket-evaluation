# websocket-evaluation
Evaluation using websocket over SockJS

# Jupiter's conclusion.
Websocket is a simple protocol to allow subscribing to a change of an event.
This is different from your poll/pull methods. In that you only need to do network requests when an event happens.
This means you can save unnecessary pings to the server and therefore reduce your costs.

The architecture is similar to a PubSub, where you subscribe to a topic and consume it.
The question is, would the operation costs be cheaper (considering scaling and you dockerized the project) 
to build and run own MQ server or use a service like AWS SQS/PubSub?