import threading, time
from queue import Queue

def producer(q):
    for i in range(5):
        print(f"Producing {i}")
        q.put(i)
        time.sleep(1)

def consumer(q):
    while True:
        item = q.get()
        print(f"Consumed {item}")
        q.task_done()

q = Queue()
threading.Thread(target=producer, args=(q,)).start()
threading.Thread(target=consumer, args=(q,), daemon=True).start()
q.join()
