#!/usr/bin/groovy
package ds;

def isDevelopBranch() {
    env.BRANCH_NAME == 'develop'
}
