import multiprocessing
import time
import random

def producer(queue, n_items):
    for i in range (n_items):
        item = random.randint(1, 100)
        queue.put(item) # Blocking put
        print(f"produced:{item}")
        time.sleep(random.uniform(0.1, 0.5))

def consumer(queue, n_items):
    for i in range (n_items):
        item = queue.get() # Blocking put
        print(f"Consumed:{item}")
        time.sleep(random.uniform(0.1, 0.5))

if __name__=="__main__":
    N_ITEMS = 10
    queue = multiprocessing.Queue(maxsize=5) # Limited size for demostrstion

    p= multiprocessing.Process(target=producer, args=(queue, N_ITEMS))
    c= multiprocessing.Process(target=consumer, args=(queue, N_ITEMS))

    p.start()
    c.start()
    p.join()
    c.join()
