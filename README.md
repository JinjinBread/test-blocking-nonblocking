# Sync / Async & Blocking / Non-Blocking with Spring

## Synchronous / Asynchronous (동기 / 비동기)
![sync_async](./docs/images/sync_async.png)

- 위 사진과 같이 Synchronous(동기) 는 순차적으로 작업이 진행되는 것을 볼 수 있고(작업의 순서가 보장됨), Asynchronous(비동기) 는 작업의 순서가 보장되지 않는 것을 볼 수 있다.

## Blocking / Non-Blocking
![blocking_nonblocking](./docs/images/blocking_nonblocking.png)
- 블로킹은 자신의 작업을 수행하다가, 다른 작업을 호출했을 때 해당하는 다른 작업이 종료될 까지 아무런 작업을 수행하지 못하고 대기하는 것을 의미한다. (위 그림을 보면 Application 이 Kernel 작업 실행한 후부터 Kernel 작업이 끝날 때까지 아무런 작업을 하지 못하는 것을 볼 수 있다.)
- 논블로킹은 자신의 작업을 수행하다 다른 작업을 호출했더라도 이 작업이 끝날 때까지 기다리지 않고 자신의 작업을 계속 수행할 수 있다.

