#!/usr/bin/groovy

package DS.Git

def IsDevBranch()
{
	env.BRANCH_NAME == 'dev'
}

def IsTestBranch() {
	env.BRANCH_NAME == 'test'
}

def IsLiveBranch() {
	env.BRANCH_NAME == 'master'
}
