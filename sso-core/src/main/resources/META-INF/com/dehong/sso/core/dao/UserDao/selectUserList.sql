SELECT
  t1.id,
  t1.u_id,
  t1.user_name,
  t1.user_from,
  t1.is_enable status,
  t1.createtime,
  t1.updatetime,
  t2.code,
  t2.name,
  t2.phone,
  t2.dept_name dept
FROM t_user t1, t_user_info t2
WHERE t1.u_id = t2.id
      AND t2.delete_falg = 0
      /*%if @isNotEmpty(userSearchDto.name) */
      AND t2.name LIKE /* '%' + userSearchDto.name + '%' */''
      /*%end*/
      /*%if @isNotEmpty(userSearchDto.userName) */
      AND t1.user_name LIKE /* '%' + userSearchDto.userName + '%' */''
      /*%end*/
      /*%if @isNotEmpty(userSearchDto.phone) */
      AND t2.phone LIKE /* '%' + userSearchDto.phone + '%' */''
      /*%end*/
      /*%if @isNotEmpty(userSearchDto.code) */
      AND t2.code LIKE /* '%' + userSearchDto.code + '%' */''
      /*%end*/
      /*%if userSearchDto.status!= null */
      AND t1.is_enable = /* userSearchDto.status */'1'
      /*%end*/