package com.hazelcast.concurrent.atomicreference;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.test.HazelcastParallelClassRunner;
import com.hazelcast.test.annotation.QuickTest;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(HazelcastParallelClassRunner.class)
@Category(QuickTest.class)
public class AtomicReferenceBasicDistributedTest extends AtomicReferenceBasicTest {

    @Override
    protected HazelcastInstance[] newInstances() {
        return createHazelcastInstanceFactory(2).newInstances();
    }

}
