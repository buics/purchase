<template>
  <div class="wrapper">
	  	<app-left-panel></app-left-panel>
      <div id="content">
        <router-view></router-view>
      </div>
	</div>


</template>

<script>
import LeftPanel from './components/LeftPanel'

export default {
  components: {
    appLeftPanel: LeftPanel,
  }
};


</script>

<style lang="scss">
@import './styles/custom-bootstrap.scss';
@import '../node_modules/bootstrap/scss/bootstrap.scss';
@import './styles/style.css'
</style>