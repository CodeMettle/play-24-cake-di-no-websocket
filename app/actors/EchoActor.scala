package actors

import akka.actor.{Actor, ActorLogging, ActorRef, Props}

/**
 * @author steven
 *
 */
object EchoActor {
  def props(webSocket: ActorRef) = {
    Props(new EchoActor(webSocket))
  }
}

class EchoActor(webSocket: ActorRef) extends Actor with ActorLogging {

  override def preStart(): Unit = {
    super.preStart()

    log.warning("{} started", self.path)
  }


  override def postStop(): Unit = {
    super.postStop()

    log.warning("{} stopped", self.path)
  }

  def receive = {
    case msg: String ⇒
      log.info("received {} from {}", msg, sender().path)
      sender() ! msg

    case other ⇒ log.warning("unknown msg {}", other)
  }
}
