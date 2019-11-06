# seesaw

semaphore simulation.

Fred starts at 1(ground), and goes up by 1. Wilma starts at 7(top max), and goes up by 1.5 on up. 

## How it works

- This simulation repeats 10 times
- Two semaphores, one for Fred and one for Wilma. 
- Both are acquired by each Wilma and Fred thread: they will both try to process their own "up" simulation
- Before the simulation, each thread will check if Fred or Wilma's height is lower than 1 or higher than 7(the maximum they can go up).
- If this check happens and the height is in the switching range, Fred thread will release Wilma's semaphore and Wilma thread will release Fred's semaphore
- This will cause the other thread to go ahead the simulation while the previously active thread is stopped because the previously active thread can't get its semaphore back as it'll try to acquire new ones every loop(simulation)
- Each successful simulation will release its own semaphore so it can get it back
- Each time the semaphores are successfully switched, the output will announce who's going up

## Shortcomings

- For some reason, I need a print statement before the else(calculation) part in order for it to not break - I have no clue why it does this
    - if it doesn't have the print statement, it'll start Fred's height at 0.5. Just very weird.
- Due to the nature of checks on how it releases the semaphores, sometimes the switch announcement ("===FRED's GOING UP===") will be announced twice
    - maybe I have to do a check after the calculations?
- Felt this was the correct way to see-saw the semaphores into two threads - using one semaphore would be easier; but would be cheating as it's not a see-saw
- If you look at the past commits in the repository, you can see I tried to make "Person" classes and a see-saw class but it didn't work out well - that way I would have to make more classes to I just switched to this way

