package com.stepstone.search.hnswlib.jna;

public class ConcurrentIndexTest extends AbstractIndexTest {

	@Override
	protected Index createIndexInstance(SpaceName spaceName, int dimensions) {
		return new ConcurrentIndex(spaceName, dimensions);
	}
}
