/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.metrics;

import net.sourceforge.pmd.lang.java.ast.ASTMethodOrConstructorDeclaration;
import net.sourceforge.pmd.lang.metrics.AbstractMetricMemoizer;

/**
 * Statistics for an operation. Keeps a map of all memoized metrics results.
 *
 * @author Clément Fournier
 */
class OperationStats extends AbstractMetricMemoizer<ASTMethodOrConstructorDeclaration> {

    private final String name;


    OperationStats(String name) {
        this.name = name;
    }


    String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OperationStats stats = (OperationStats) o;

        return name != null ? name.equals(stats.name) : stats.name == null;
    }


    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
