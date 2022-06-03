package programmers.level3

import java.util.*

fun diskController(jobs: Array<IntArray>): Int {
    val jobQueue = PriorityQueue(compareBy<IntArray> { it[0] }.thenBy { it[1] })
    jobs.forEach { jobQueue.add(it) }

    val jobSchedulingQueue = PriorityQueue(compareBy<IntArray> { it[1] })

    val firstJob = jobQueue.poll()
    var times = firstJob[0] + firstJob[1]
    var result = times - firstJob[0]

    while (jobQueue.isNotEmpty() || jobSchedulingQueue.isNotEmpty()) {
        if (jobQueue.isNotEmpty() && jobQueue.peek()[0] <= times) {
            jobSchedulingQueue.add(jobQueue.poll())
            continue
        }
        if (jobSchedulingQueue.isNotEmpty()) {
            val job = jobSchedulingQueue.poll()
            times += job[1]
            result += times - job[0]
        } else
            times = jobQueue.peek()[0]
    }

    return result / jobs.size
}