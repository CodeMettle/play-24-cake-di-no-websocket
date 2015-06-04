Can't get Play 2.4 to open a WebSocket with Cake DI
=================================

WebSocket fails with

```
! @6mc7a9790 - Internal server error, for (GET) [/ws] ->

play.api.http.HttpErrorHandlerExceptions$$anon$1: Execution exception[[InstantiationException: null]]
	at play.api.http.HttpErrorHandlerExceptions$.throwableToUsefulException(HttpErrorHandler.scala:254) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.api.http.DefaultHttpErrorHandler.onServerError(HttpErrorHandler.scala:180) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.core.server.netty.PlayDefaultUpstreamHandler$$anonfun$messageReceived$1.applyOrElse(PlayDefaultUpstreamHandler.scala:182) [play-netty-server_2.11-2.4.0.jar:2.4.0]
	at play.core.server.netty.PlayDefaultUpstreamHandler$$anonfun$messageReceived$1.applyOrElse(PlayDefaultUpstreamHandler.scala:180) [play-netty-server_2.11-2.4.0.jar:2.4.0]
	at scala.runtime.AbstractPartialFunction.apply(AbstractPartialFunction.scala:36) [scala-library-2.11.6.jar:na]
	at scala.util.Failure$$anonfun$recover$1.apply(Try.scala:215) [scala-library-2.11.6.jar:na]
	at scala.util.Try$.apply(Try.scala:191) [scala-library-2.11.6.jar:na]
	at scala.util.Failure.recover(Try.scala:215) [scala-library-2.11.6.jar:na]
	at scala.concurrent.Future$$anonfun$recover$1.apply(Future.scala:324) [scala-library-2.11.6.jar:na]
	at scala.concurrent.Future$$anonfun$recover$1.apply(Future.scala:324) [scala-library-2.11.6.jar:na]
	at scala.concurrent.impl.CallbackRunnable.run(Promise.scala:32) [scala-library-2.11.6.jar:na]
	at play.api.libs.iteratee.Execution$trampoline$.executeScheduled(Execution.scala:109) [play-iteratees_2.11-2.4.0.jar:2.4.0]
	at play.api.libs.iteratee.Execution$trampoline$.execute(Execution.scala:71) [play-iteratees_2.11-2.4.0.jar:2.4.0]
	at scala.concurrent.impl.CallbackRunnable.executeWithValue(Promise.scala:40) [scala-library-2.11.6.jar:na]
	at scala.concurrent.impl.Promise$DefaultPromise.tryComplete(Promise.scala:248) [scala-library-2.11.6.jar:na]
	at scala.concurrent.Promise$class.complete(Promise.scala:55) [scala-library-2.11.6.jar:na]
	at scala.concurrent.impl.Promise$DefaultPromise.complete(Promise.scala:153) [scala-library-2.11.6.jar:na]
	at scala.concurrent.Future$$anonfun$map$1.apply(Future.scala:235) [scala-library-2.11.6.jar:na]
	at scala.concurrent.Future$$anonfun$map$1.apply(Future.scala:235) [scala-library-2.11.6.jar:na]
	at scala.concurrent.impl.CallbackRunnable.run(Promise.scala:32) [scala-library-2.11.6.jar:na]
	at akka.dispatch.BatchingExecutor$AbstractBatch.processBatch(BatchingExecutor.scala:55) [akka-actor_2.11-2.3.11.jar:na]
	at akka.dispatch.BatchingExecutor$BlockableBatch$$anonfun$run$1.apply$mcV$sp(BatchingExecutor.scala:91) [akka-actor_2.11-2.3.11.jar:na]
	at akka.dispatch.BatchingExecutor$BlockableBatch$$anonfun$run$1.apply(BatchingExecutor.scala:91) [akka-actor_2.11-2.3.11.jar:na]
	at akka.dispatch.BatchingExecutor$BlockableBatch$$anonfun$run$1.apply(BatchingExecutor.scala:91) [akka-actor_2.11-2.3.11.jar:na]
	at scala.concurrent.BlockContext$.withBlockContext(BlockContext.scala:72) [scala-library-2.11.6.jar:na]
	at akka.dispatch.BatchingExecutor$BlockableBatch.run(BatchingExecutor.scala:90) [akka-actor_2.11-2.3.11.jar:na]
	at akka.dispatch.TaskInvocation.run(AbstractDispatcher.scala:40) [akka-actor_2.11-2.3.11.jar:na]
	at akka.dispatch.ForkJoinExecutorConfigurator$AkkaForkJoinTask.exec(AbstractDispatcher.scala:397) [akka-actor_2.11-2.3.11.jar:na]
	at scala.concurrent.forkjoin.ForkJoinTask.doExec(ForkJoinTask.java:260) [scala-library-2.11.6.jar:na]
	at scala.concurrent.forkjoin.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1339) [scala-library-2.11.6.jar:na]
	at scala.concurrent.forkjoin.ForkJoinPool.runWorker(ForkJoinPool.java:1979) [scala-library-2.11.6.jar:na]
	at scala.concurrent.forkjoin.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:107) [scala-library-2.11.6.jar:na]
Caused by: java.lang.InstantiationException: null
	at sun.reflect.InstantiationExceptionConstructorAccessorImpl.newInstance(InstantiationExceptionConstructorAccessorImpl.java:48) ~[na:1.8.0_45]
	at java.lang.reflect.Constructor.newInstance(Constructor.java:422) ~[na:1.8.0_45]
	at java.lang.Class.newInstance(Class.java:442) ~[na:1.8.0_45]
	at play.api.inject.NewInstanceInjector$.instanceOf(Injector.scala:49) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.api.inject.SimpleInjector$$anonfun$instanceOf$1.apply(Injector.scala:85) ~[play_2.11-2.4.0.jar:2.4.0]
	at scala.collection.MapLike$class.getOrElse(MapLike.scala:128) ~[scala-library-2.11.6.jar:na]
	at scala.collection.AbstractMap.getOrElse(Map.scala:59) ~[scala-library-2.11.6.jar:na]
	at play.api.inject.SimpleInjector.instanceOf(Injector.scala:85) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.api.inject.SimpleInjector.instanceOf(Injector.scala:80) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.api.Application$$anonfun$instanceCache$1.apply(Application.scala:234) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.api.Application$$anonfun$instanceCache$1.apply(Application.scala:234) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.utils.InlineCache.fresh(InlineCache.scala:69) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.utils.InlineCache.apply(InlineCache.scala:62) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.api.libs.concurrent.Akka$.system(Akka.scala:37) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.api.mvc.WebSocket$$anonfun$tryAcceptWithActor$1$$anonfun$apply$8$$anonfun$apply$9$$anonfun$apply$10.apply(WebSocket.scala:174) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.api.mvc.WebSocket$$anonfun$tryAcceptWithActor$1$$anonfun$apply$8$$anonfun$apply$9$$anonfun$apply$10.apply(WebSocket.scala:173) ~[play_2.11-2.4.0.jar:2.4.0]
	at play.core.server.netty.PlayDefaultUpstreamHandler$$anonfun$messageReceived$5.apply(PlayDefaultUpstreamHandler.scala:179) ~[play-netty-server_2.11-2.4.0.jar:2.4.0]
	at play.core.server.netty.PlayDefaultUpstreamHandler$$anonfun$messageReceived$5.apply(PlayDefaultUpstreamHandler.scala:170) ~[play-netty-server_2.11-2.4.0.jar:2.4.0]
	at scala.util.Success$$anonfun$map$1.apply(Try.scala:236) ~[scala-library-2.11.6.jar:na]
	at scala.util.Try$.apply(Try.scala:191) [scala-library-2.11.6.jar:na]
	at scala.util.Success.map(Try.scala:236) ~[scala-library-2.11.6.jar:na]
	at scala.concurrent.Future$$anonfun$map$1.apply(Future.scala:235) [scala-library-2.11.6.jar:na]
	at scala.concurrent.Future$$anonfun$map$1.apply(Future.scala:235) [scala-library-2.11.6.jar:na]
	at scala.concurrent.impl.CallbackRunnable.run(Promise.scala:32) [scala-library-2.11.6.jar:na]
	at play.api.libs.iteratee.Execution$trampoline$.execute(Execution.scala:70) [play-iteratees_2.11-2.4.0.jar:2.4.0]
	... 19 common frames omitted
java.lang.IllegalArgumentException: unsupported message type: class org.jboss.netty.handler.codec.http.DefaultHttpResponse
	at org.jboss.netty.channel.socket.nio.SocketSendBufferPool.acquire(SocketSendBufferPool.java:52)
	at org.jboss.netty.channel.socket.nio.AbstractNioWorker.write0(AbstractNioWorker.java:193)
	at org.jboss.netty.channel.socket.nio.AbstractNioWorker.writeFromTaskLoop(AbstractNioWorker.java:151)
	at org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteTask.run(AbstractNioChannel.java:315)
	at org.jboss.netty.channel.socket.nio.AbstractNioSelector.processTaskQueue(AbstractNioSelector.java:391)
	at org.jboss.netty.channel.socket.nio.AbstractNioSelector.run(AbstractNioSelector.java:315)
	at org.jboss.netty.channel.socket.nio.AbstractNioWorker.run(AbstractNioWorker.java:89)
	at org.jboss.netty.channel.socket.nio.NioWorker.run(NioWorker.java:178)
	at org.jboss.netty.util.ThreadRenamingRunnable.run(ThreadRenamingRunnable.java:108)
	at org.jboss.netty.util.internal.DeadLockProofWorker$1.run(DeadLockProofWorker.java:42)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
```

Comment out

```
  application {
    loader = "com.myapp.AppLoader"
  }
```

in `application.conf` and everything works.
