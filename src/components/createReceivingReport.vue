<template>
    <div>
        <div class="card">
            <div class="card-header">
                <strong class="card-title">Receiving Reports</strong>
            </div>
            <div class="car-body">
                <!--Table Start-->
                <div id="table" class="table-editable" style="padding:15px">
                    <table class="table table-bordered table-responsive-md table-striped text-center">
                        <tr>
                            <th class="text-center">Vendor</th>
                            <th class="text-center">Contact Person</th>
                            <th class="text-center">Post Date</th>
                            <th class="text-center">Request Date</th>
                            <th class="text-center">Status</th>
                            <th class="text-center"></th>
                        </tr>
                        <tr v-for="(item,index) in pQuotation" :key="index">
                            <td class="pt-3-half">{{item.vendor}}</td>
                            <td class="pt-3-half">{{item.cPerson}}</td>
                            <td class="pt-3-half">{{item.postDate}}</td>
                            <td class="pt-3-half">{{item.requiredDate}}</td>
                            <td class="pt-3-half">{{item.status}}</td>
                            <td>
                                <span>
                                    <button @click="changeClickKey(index)" type="button" class="btn btn-primary btn-rounded btn-sm my-0" data-toggle="modal" data-target="#viewModal">View</button>
                                </span>
                          
                                <span>
                                    <button type="button" class="btn btn-danger text-center" data-toggle="modal" data-target="#deleteModal">
                                        Delete
                                    </button>
                                </span>
                              
                            </td>
                        </tr>
                    </table>
                </div>
                <!-- Table End -->
            </div>
        </div>
    </div>
</template>
<script>
export default {
    
}
</script>

<style>

</style>
